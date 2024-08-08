package main;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.node.ObjectNode;

public class Criteria {
//	public static String riskCriteriaApiCall(String mainClsCode, String productCode, String agtGrpCode, String occCode,
//			String natCode, int age, String key) {
//		mainClsCode = "MH";
//		productCode = "MH03T";
//		agtGrpCode = "AGT0001";
//		occCode = "";
//		natCode = "A00005";
//		age = 55;
//		ObjectNode inputJson = new ObjectMapper().createObjectNode();
//		inputJson.put("mainClsCode", mainClsCode);
//		inputJson.put("productCode", productCode);
//		inputJson.put("agtGrpCode", agtGrpCode);
//		inputJson.put("occCode", occCode);
//		inputJson.put("natCode", natCode);
//		inputJson.put("age", age);
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
//		String[] items = riskTypeDesc.toString().split(", ");
//
//		// Use a Set to store unique items
//		Set<String> uniqueItems = new LinkedHashSet<>(Arrays.asList(items));
//
//		// Join the unique items back into a string
//		String result = String.join(", ", uniqueItems);
//
//		System.out.println(result);
//		System.out.println("========== " + riskType);
//
//		if (key.equals("riskType")) {
//			return riskType.toString().trim();
//		} else {
//			return result;
//		}
//	}
//
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

	public static LinkedList<InsuredDetails> addToRiskCriteriaList(String insDob, String natCode, String occCode,
			int insPlanContri, int insPlSstAmt, int insMcoFees, int insMcoSstAmt, int insPerTot, int insCommAmt,
			int insNetPayable, LinkedList<InsuredDetails> riskCriteriaEntitieList) {
		InsuredDetails criteriaEntity = new InsuredDetails();
		criteriaEntity.setInsDob(insDob);
		criteriaEntity.setNatCode(natCode);
		criteriaEntity.setOccCode(occCode);
		criteriaEntity.setInsPlanContri(insPlanContri);
		criteriaEntity.setInsPlSstAmt(insPlSstAmt);
		criteriaEntity.setInsMcoFees(insMcoFees);
		criteriaEntity.setInsMcoSstAmt(insMcoSstAmt);
		criteriaEntity.setInsPerTot(insPerTot);
		criteriaEntity.setInsCommAmt(insCommAmt);
		criteriaEntity.setInsNetPayable(insNetPayable);

		// Add the created instance to the list
		riskCriteriaEntitieList.add(criteriaEntity);
		return riskCriteriaEntitieList;

	}

	public static String appendString(String temp, String value) {
		if (temp == null || temp == "" || temp.isEmpty() || temp.isBlank()) {
			temp = value;
			return temp;
		}
		temp = temp + ", " + value;
		return temp;
	}

	public static String removeDuplicates(String input) {
		String[] values = input.split(",\\s*");
		Set<String> uniqueValues = new LinkedHashSet<>(Arrays.asList(values));
		String result = String.join(", ", uniqueValues);
		return result;
	}
}
