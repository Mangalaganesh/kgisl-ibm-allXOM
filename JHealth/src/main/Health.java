package main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.node.ObjectNode;

public class Health {

//	public static String riskCriteriaApiCall(List<Object> objectList, String productCode, String agtGrpCode,
//			String key) {
//		ObjectNode inputJson = new ObjectMapper().createObjectNode();
//		inputJson.put("mainClsCode", "MH");
//		inputJson.put("productCode", "MH03T");
//		inputJson.put("agtGrpCode", "AGT0001");
//		inputJson.put("occCode", "");
//		inputJson.put("natCode", "A00005");
//		inputJson.put("age", 55);
//
//		List<String> fieldNames = new ArrayList<>();
//		StringBuilder riskType = new StringBuilder();
//		StringBuilder riskTypeDesc = new StringBuilder();
//		Iterator<String> fieldNameIterator = inputJson.fieldNames();
//		while (fieldNameIterator.hasNext()) {
//			String fieldName = fieldNameIterator.next();
//			fieldNames.add(fieldName);
//		}
//		ObjectNode currentCombination = new ObjectMapper().createObjectNode();
//		generateCombinations(inputJson, currentCombination, fieldNames, 0, riskType, riskTypeDesc);
//		if (riskType.toString().contains("D")) {
//			riskType = riskType.delete(0, riskType.length());
//			riskType = riskType.append("D");
//		} else if (riskType.toString().contains("R")) {
//			riskType = riskType.delete(0, riskType.length());
//			riskType = riskType.append("R");
//		} else if (riskType.toString().contains("A")) {
//			riskType = riskType.delete(0, riskType.length());
//			riskType = riskType.append("A");
//		} else {
//			riskType = null;
//		}
//
//		System.out.println("========== " + riskType);
//
//		String response = retrieveKeyBasedRiskResponse(key, riskType, riskTypeDesc);
//		return response;
////		String responseBody = "";
////		StringBuilder riskType = new StringBuilder();
////		StringBuilder riskTypeDesc = new StringBuilder();
////		String apiUrl = "http://10.100.1.171:9060/DecisionService/rest/HSRiskCriteria/1.0/HSRiskCriteria/1.10";
////		try {
////			List<RiskCriteria> riskCriteriaList = convertObjectListToRiskCriteriaList(objectList);
////
////			URL url = new URL(apiUrl);
////			for (RiskCriteria criteria : riskCriteriaList) {
////				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
////
////				connection.setRequestMethod("POST");
////
////				// Set the request headers if needed (e.g., content type)
////				connection.setRequestProperty("Content-Type", "application/json");
////
////				// Enable input/output streams for the request
////				connection.setDoInput(true);
////				connection.setDoOutput(true);
////
////				// Create the request body JSON data
////				String requestBody = "{\r\n" + "    \"productCode\": \"" + productCode + "\",\r\n"
////						+ "    \"agtGrpCode\": \"" + agtGrpCode + "\",\r\n" + "    \"occCode\": \""
////						+ criteria.getOccCode() + "\",\r\n" + "    \"natCode\": \"" + criteria.getNatCode() + "\",\r\n"
////						+ "    \"age\": " + criteria.getAge() + "\r\n" + "}";
////
////				// Convert the JSON request body to bytes
////				byte[] requestBodyBytes = requestBody.getBytes(StandardCharsets.UTF_8);
////
////				// Set the content length of the request
////				connection.setRequestProperty("Content-Length", String.valueOf(requestBodyBytes.length));
////
////				// Create an output stream to send the request body
////				try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
////					wr.write(requestBodyBytes);
////				}
////
////				// Get the response code
////				int responseCode = connection.getResponseCode();
////
////				if (responseCode == HttpURLConnection.HTTP_OK) {
////					// Read the response from the API
////					BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
////					String line;
////					StringBuilder response = new StringBuilder();
////
////					while ((line = reader.readLine()) != null) {
////						response.append(line);
////					}
////					reader.close();
////					responseBody = response.toString();
////					ObjectMapper mapper = new ObjectMapper();
////					JsonNode jsonObject = mapper.readTree(responseBody);
////
////					if (riskType.toString() == null || riskType.toString().isBlank() || riskType.toString().isEmpty()) {
////						riskType = riskType.append(jsonObject.get("riskType").textValue());
////					} else {
////						riskType = riskType.append(", " + jsonObject.get("riskType").textValue());
////					}
////
////					if (riskTypeDesc.toString() == null || riskTypeDesc.toString().isBlank()
////							|| riskTypeDesc.toString().isEmpty()) {
////						riskTypeDesc = riskTypeDesc.append(jsonObject.get("riskTypeDesc").textValue());
////					} else {
////						riskTypeDesc = riskTypeDesc.append(", " + jsonObject.get("riskTypeDesc").textValue());
////					}
////
////				} else {
////					System.err.println("Failed to retrieve data from API. Response code: " + responseCode);
////				}
////
////				connection.disconnect();
////			}
////		} catch (Exception e) {
////			e.printStackTrace();
////		}
////
////		return retrieveKeyBasedRiskResponse(key, riskType, riskTypeDesc);
////
//	}

//	public static void generateCombinations(ObjectNode inputJson, ObjectNode currentCombination,
//			List<String> fieldNames, int fieldIndex, StringBuilder riskType, StringBuilder riskTypeDesc) {
//		if (fieldIndex == fieldNames.size()) {
//			// Print or use the combination as needed
//			System.out.println(currentCombination.toString());
//			String mainClsCode = "";
//			String productCode = "";
//			String agtGrpCode = "";
//			String occCode = "";
//			String natCode = "";
//			int age = 0;
//			if (currentCombination.has("mainClsCode"))
//				mainClsCode = (currentCombination.get("mainClsCode").textValue() == null
//						|| currentCombination.get("mainClsCode").textValue().isEmpty()) ? ""
//								: currentCombination.get("mainClsCode").textValue();
//			if (currentCombination.has("productCode"))
//				productCode = currentCombination.get("productCode").textValue() == null
//						|| currentCombination.get("productCode").textValue().isEmpty() ? ""
//								: currentCombination.get("productCode").textValue();
//
//			if (currentCombination.has("agtGrpCode"))
//				agtGrpCode = currentCombination.get("agtGrpCode").textValue() == null
//						|| currentCombination.get("agtGrpCode").textValue().isEmpty() ? ""
//								: currentCombination.get("agtGrpCode").textValue();
//
//			if (currentCombination.has("occCode"))
//				occCode = currentCombination.get("occCode").textValue() == null
//						|| currentCombination.get("occCode").textValue().isEmpty() ? ""
//								: currentCombination.get("occCode").textValue();
//			if (currentCombination.has("natCode"))
//				natCode = (!currentCombination.has("natCode")) && (currentCombination.get("natCode").textValue() == null
//						|| currentCombination.get("natCode").textValue().isEmpty()) ? ""
//								: currentCombination.get("natCode").textValue();
//			if (currentCombination.has("age"))
//				age = currentCombination.get("age").asInt() == 0 ? 0 : currentCombination.get("age").asInt();
//			String requestBody = "{\r\n" + "    \"riskCriteria\": {\r\n" + "    \"mainClsCode\": \"" + mainClsCode
//					+ "\",\r\n" + "    \"productCode\": \"" + productCode + "\",\r\n" + "    \"agtGrpCode\": \""
//					+ agtGrpCode + "\",\r\n" + "    \"occCode\": \"" + occCode + "\",\r\n" + "    \"natCode\": \""
//					+ natCode + "\",\r\n" + "    \"age\": " + age + "\r\n" + "    }\r\n" + "}";
//
//			System.out.println(" --=-==-=-= " + requestBody);
//			apiCall(requestBody, riskType, riskTypeDesc);
//		} else {
//			String fieldName = fieldNames.get(fieldIndex);
//			JsonNode fieldValue = inputJson.get(fieldName);
//
//			// Include the field in the current combination
//			currentCombination.put(fieldName, fieldValue);
//
//			// Recurse to the next field
//			generateCombinations(inputJson, currentCombination, fieldNames, fieldIndex + 1, riskType, riskTypeDesc);
//			// Exclude the field from the current combination
//			currentCombination.remove(fieldName);
//
//			// Recurse to the next field
//			generateCombinations(inputJson, currentCombination, fieldNames, fieldIndex + 1, riskType, riskTypeDesc);
//		}
//	}

//	private static void apiCall(String requestBody, StringBuilder riskType, StringBuilder riskTypeDesc) {
//		try {
//			URL url = new URL("http://10.100.1.171:9060/DecisionService/rest/Risk/1.0/HSRiskCriteria/1.2");
//
//			// Get the response code
//			int responseCode;
//			String responseBody;
//
//			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//			connection.setRequestMethod("POST");
//			connection.setRequestProperty("Content-Type", "application/json");
//			connection.setDoInput(true);
//			connection.setDoOutput(true);
//			// Convert the JSON request body to bytes
//			byte[] requestBodyBytes = requestBody.toString().getBytes(StandardCharsets.UTF_8);
//			connection.setRequestProperty("Content-Length", String.valueOf(requestBodyBytes.length));
//
//			// Create an output stream to send the request body
//			try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
//				wr.write(requestBodyBytes);
//			}
//
//			// Get the response code
//			responseCode = connection.getResponseCode();
//
//			if (responseCode == HttpURLConnection.HTTP_OK) {
//				// Read the response from the API
//				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//				String line;
//				StringBuilder response = new StringBuilder();
//
//				while ((line = reader.readLine()) != null) {
//					response.append(line);
//				}
//				reader.close();
//				responseBody = response.toString();
//				ObjectMapper mapper = new ObjectMapper();
//				JsonNode jsonNode = mapper.readTree(responseBody);
//				System.out.println("--- " + jsonNode);
//				if (riskType.toString() == null || riskType.toString().isEmpty()) {
//					if (jsonNode.get("riskCriteria").get("riskType").textValue() != null)
//						riskType = riskType.append(jsonNode.get("riskCriteria").get("riskType").textValue());
//
//				} else {
//					if (jsonNode.get("riskCriteria").get("riskType").textValue() != null)
//						riskType = riskType.append(", " + jsonNode.get("riskCriteria").get("riskType").textValue());
//				}
//
//				if (riskTypeDesc.toString() == null || riskTypeDesc.toString().isEmpty()) {
//					if (jsonNode.get("riskCriteria").get("riskTypeDesc").textValue() != null)
//						riskTypeDesc = riskTypeDesc
//								.append(jsonNode.get("riskCriteria").get("riskTypeDesc").textValue());
//
//				} else {
//					if (jsonNode.get("riskCriteria").get("riskTypeDesc").textValue() != null)
//						riskTypeDesc = riskTypeDesc
//								.append(", " + jsonNode.get("riskCriteria").get("riskTypeDesc").textValue());
//				}
//			} else {
//				// Handle the API error
//				System.out.println("API Request Failed with Response Code: " + responseCode);
//			}
//
//			connection.disconnect();
//
//			System.out.println("Risk Types - " + riskType);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

	private static String retrieveKeyBasedRiskResponse(String key, StringBuilder riskType, StringBuilder riskTypeDesc) {
		if (key.equalsIgnoreCase("riskType")) {
			if (riskType.toString().contains("D")) {
				riskType = riskType.delete(0, riskType.length());
				riskType = riskType.append("D");
			} else if (riskType.toString().contains("R")) {
				riskType = riskType.delete(0, riskType.length());
				riskType = riskType.append("R");
			} else if (riskType.toString().contains("A")) {
				riskType = riskType.delete(0, riskType.length());
				riskType = riskType.append("A");
			} else {
				riskType = null;
			}
			return riskType.toString().trim();
		} else {
			if (riskTypeDesc.toString() == null || riskTypeDesc.toString().isEmpty()) {
				return "Empty";
			}
			String[] items = riskTypeDesc.toString().split(", ");

			// Use a Set to store unique items
			Set<String> uniqueItems = new LinkedHashSet<>(Arrays.asList(items));

			// Join the unique items back into a string
			String result = String.join(", ", uniqueItems);
			return result.toString().trim();
		}
	}

	private static List<RiskCriteria> convertObjectListToRiskCriteriaList(List<Object> objectList) {
		List<RiskCriteria> riskCriteriaList = objectList.stream().filter(obj -> obj instanceof Map).map(obj -> {
			Map<?, ?> map = (Map<?, ?>) obj;
			RiskCriteria riskCriteria = new RiskCriteria();
			riskCriteria.setOccCode((String) map.get("occCode"));
			riskCriteria.setNatCode((String) map.get("natCode"));
			if ((String) map.get("insDob").toString() != null && !map.get("insDob").toString().isEmpty()
					&& !map.get("insDob").toString().isBlank()) {
				Date date = HealthUtilDates.converDateFormat((String) map.get("insDob"));
				Integer age = HealthUtilDates.calculateAge(date).intValue();
//				riskCriteria.setAge(age);
			} else {
//				riskCriteria.setAge(55);
			}
			return riskCriteria;
		}).collect(Collectors.toList());
		return riskCriteriaList;
	}

}
