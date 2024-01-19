Feature: Validate OE API

  Scenario: Validate OE Data Update API
    Given User performed request for type: POST, for base url: https://goldengate-staging10.paytm.com, endpoint: MerchantService/v1/workflow/lead, requestFile: src/main/java/utils/requestBody.json and Expected key: "stage" & value: "LIS_DATA_UPDATE_SUCCESS", Expected status code: 200