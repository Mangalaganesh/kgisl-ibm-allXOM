package main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.node.ArrayNode;
//import com.fasterxml.jackson.databind.node.ObjectNode;

public class Contribution {
//	public static Object contibutionCalculaton(String mainClsCode, String agtGrpCode, String sourceCode,
//			String productCode, int noOfIns, String planCode, double commPct, String contactType,
//			Character sstWaiverInd, double rebatePct, String riskType, String riskTypeDesc, double basicContri,
//			double mcoFee, String incepDt, String expiryDt, String cnIssueDt, List<Object> objectList) {
//		Object object = new Object();
//		ObjectMapper objectMapper = new ObjectMapper();
//		ObjectNode node = objectMapper.createObjectNode();
//		if (riskType == null || riskType.isEmpty() || riskType.isBlank() || riskType.contains("D")) {
//			node.put("mainClsCode", mainClsCode);
//			node.put("agtGrpCode", agtGrpCode);
//			node.put("sourceCode", sourceCode);
//			node.put("productCode", productCode);
//			node.put("noOfIns", noOfIns);
//			node.put("planCode", planCode);
//			node.put("cnIssueDt", cnIssueDt);
//			node.put("incepDt", incepDt);
//			node.put("expiryDt", expiryDt);
//			node.put("commPct", commPct);
//			node.put("contactType", contactType);
//			node.put("sstWaiverInd", sstWaiverInd);
//			node.put("rebatePct", rebatePct);
//			node.put("riskType", riskType);
//			node.put("riskTypeDesc", riskTypeDesc);
//			
//			ObjectMapper mapper = new ObjectMapper();
//			object = mapper.valueToTree(node);
//			System.out.println("Node -- " + node);
//			return object;
//
//		}
//		try {
//			String apiUrl = "http://10.100.1.171:9060/DecisionService/rest/ContributionCalculation/1.0/HSContribution/1.0";
//			String responseBody = "";
//			URL url = new URL(apiUrl);
//			List<Object> insDetList = new LinkedList<>();
//			String cnIssueDtInt = convertDateFormat(cnIssueDt);
//			String incepDtInt = convertDateFormat(incepDt);
//			String expiryDtInt = convertDateFormat(expiryDt);
//			for (Object insDetObj : objectList) {
//				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//				connection.setRequestMethod("POST");
//
//				// Set the request headers if needed (e.g., content type)
//				connection.setRequestProperty("Content-Type", "application/json");
//
//				// Enable input/output streams for the request
//				connection.setDoInput(true);
//				connection.setDoOutput(true);
//				String insDob = "";
//				String natCode = "";
//				String occCode = "";
//				if (insDetObj instanceof Map) {
//					Map<?, ?> map = (Map<?, ?>) insDetObj;
//
//					// Check and extract values if they exist in the map
//					if (map.containsKey("insDob")) {
//						insDob = (String) map.get("insDob");
//					}
//					if (map.containsKey("natCode")) {
//						natCode = (String) map.get("natCode");
//					}
//					if (map.containsKey("occCode")) {
//						occCode = (String) map.get("occCode");
//					}
//				}
//
//				// Create the request body JSON data
////				String requestBody = "{\n" + "    \"mainClsCode\": \"" + mainClsCode + "\",\n"
////						+ "    \"agtGrpCode\": \"" + agtGrpCode + "\",\n" + "    \"sourceCode\": \"" + sourceCode
////						+ "\",\n" + "    \"productCode\": \"" + productCode + "\",\n" + "    \"noOfIns\": " + noOfIns
////						+ ",\n" + "    \"planCode\": \"" + planCode + "\",\n" + "    \"cnIssueDtInt\": \""
////						+ cnIssueDtInt + "\",\n" + "    \"incepDtInt\": \"" + incepDtInt + "\",\n"
////						+ "    \"expiryDtInt\": \"" + expiryDtInt + "\",\n" + "    \"commPct\": " + commPct + ",\n"
////						+ "    \"contactType\": \"" + contactType + "\",\n" + "    \"sstWaiverInd\": \"" + sstWaiverInd
////						+ "\",\n" + "    \"natCode\": \"" + natCode + "\",\n" + "    \"occCode\": \"" + occCode
////						+ "\",\n" + "    \"insDob\": \"" + insDob + "\",\n" + "    \"rebatePct\": " + rebatePct + ",\n"
////						+ "    \"riskType\": \"" + riskType + "\",\n" + "    \"basicContri\": " + basicContri + ",\n"
////						+ "    \"mcoFee\": " + mcoFee + ",\n" + "    \"incepDt\": \"" + incepDt + "\",\n"
////						+ "    \"expiryDt\": \"" + expiryDt + "\"\n" + "}";
//
//				String requestBody = "{\r\n" + "    \"mainClsCode\": \"" + mainClsCode + "\",\r\n"
//						+ "    \"agtGrpCode\": \"" + agtGrpCode + "\",\r\n" + "    \"sourceCode\": \"" + sourceCode
//						+ "\",\r\n" + "    \"productCode\": \"" + productCode + "\",\r\n" + "    \"noOfIns\": "
//						+ noOfIns + ",\r\n" + "    \"planCode\": \"" + planCode + "\",\r\n" + "    \"cnIssueDtInt\": \""
//						+ cnIssueDtInt + "\",\r\n" + "    \"incepDtInt\": \"" + incepDtInt + "\",\r\n"
//						+ "    \"expiryDtInt\": \"" + expiryDtInt + "\",\r\n" + "    \"commPct\": " + commPct + ",\r\n"
//						+ "    \"contactType\": \"" + contactType + "\",\r\n" + "    \"sstWaiverInd\": \""
//						+ sstWaiverInd + "\",\r\n" + "    \"natCode\": \"" + natCode + "\",\r\n" + "    \"occCode\": \""
//						+ occCode + "\",\r\n" + "    \"insDob\": \"" + insDob + "\",\r\n" + "    \"rebatePct\": "
//						+ rebatePct + ",\r\n" + "    \"riskType\": \"" + riskType + "\",\r\n" + "    \"basicContri\": "
//						+ basicContri + ",\r\n" + "    \"mcoFee\": " + mcoFee + ",\r\n" + "    \"incepDt\": \""
//						+ incepDt + "\",\r\n" + "    \"expiryDt\": \"" + expiryDt + "\",\r\n" + "    \"cnIssueDt\": \""
//						+ cnIssueDt + "\"\r\n" + "}";
//				// Convert the JSON request body to bytes
//				byte[] requestBodyBytes = requestBody.getBytes(StandardCharsets.UTF_8);
//
//				// Set the content length of the request
//				connection.setRequestProperty("Content-Length", String.valueOf(requestBodyBytes.length));
//
//				// Create an output stream to send the request body
//				try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
//					wr.write(requestBodyBytes);
//				}
//
//				// Get the response code
//				int responseCode = connection.getResponseCode();
//
//				if (responseCode == HttpURLConnection.HTTP_OK) {
//					// Read the response from the API
//					BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//					String line;
//					StringBuilder response = new StringBuilder();
//
//					while ((line = reader.readLine()) != null) {
//						response.append(line);
//					}
//					reader.close();
//					responseBody = response.toString();
//
//					ObjectMapper mapper = new ObjectMapper();
//					JsonNode jsonNode = mapper.readTree(responseBody);
//
//					ObjectNode addedObjectnode = addObjectNodeData(insDob, natCode, occCode, jsonNode);
//					insDetList.add(addedObjectnode);
//
//					ObjectNode objectNode = jsonNode.deepCopy();
//					removeUnwantedDataFromObjectNode(objectNode);
//
//					ArrayNode arrayNode = mapper.valueToTree(insDetList);
//					objectNode.set("insDetails", arrayNode);
//					objectNode.put("riskTypeDesc", riskTypeDesc);
//					node = objectNode.deepCopy();
//				} else {
//					System.err.println("Failed to retrieve data from API. Response code: " + responseCode);
//				}
//
//				connection.disconnect();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		ObjectMapper mapper = new ObjectMapper();
//		object = mapper.valueToTree(node);
//		System.out.println("Node -- " + node);
//		return object;
//
//	}

//	private static ObjectNode addObjectNodeData(String insDob, String natCode, String occCode, JsonNode jsonNode) {
//		ObjectMapper mapper1 = new ObjectMapper();
//		ObjectNode newJsonNode = mapper1.createObjectNode();
//		// Copy over the fields you want to keep with modifications
//		newJsonNode.put("insDob", insDob);
//		newJsonNode.put("natCode", natCode);
//		newJsonNode.put("occCode", occCode);
//		newJsonNode.put("insPlanContri", jsonNode.get("insPlanContri").asDouble());
//
//		// Copy over other fields as needed
//		newJsonNode.put("insPlSstAmt", jsonNode.get("insPlSstAmt").asDouble());
//		newJsonNode.put("insMcoFees", jsonNode.get("insMcoFees").asDouble());
//		newJsonNode.put("insMcoSstAmt", jsonNode.get("insMcoSstAmt").asDouble());
//		newJsonNode.put("insPerTot", jsonNode.get("insPerTot").asDouble());
//		newJsonNode.put("insCommAmt", jsonNode.get("insCommAmt").asDouble());
//		newJsonNode.put("insNetPayable", jsonNode.get("insNetPayable").asDouble());
//		return newJsonNode;
//	}

//	private static void removeUnwantedDataFromObjectNode(ObjectNode objectNode) {
//		objectNode.remove("insDob");
//		objectNode.remove("natCode");
//		objectNode.remove("occCode");
//		objectNode.remove("insPlanContri");
//		objectNode.remove("insPlSstAmt");
//		objectNode.remove("insMcoFees");
//		objectNode.remove("insMcoSstAmt");
//		objectNode.remove("insPerTot");
//		objectNode.remove("insCommAmt");
//		objectNode.remove("insNetPayable");
//	}

	public static String convertDateFormat(String inputDateStr) {
		try {
			// Define the input and output date formats
			SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd-MM-yyyy");
			SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");

			// Parse the input date string
			Date inputDate = inputDateFormat.parse(inputDateStr);
			System.out.println(inputDateStr);
			// Format the date to the desired output format
			String outputDateStr = outputDateFormat.format(inputDate);
			return outputDateStr;
		} catch (ParseException e) {
			e.printStackTrace();
			// Handle the exception as needed
			return null;
		}
	}
}
