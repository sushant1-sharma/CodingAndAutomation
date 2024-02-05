Feature: Validate my API

  Scenario: Validate my Data Update API
    Given User performed request for type: POST, for base url: https://abc.com, endpoint: /abc, requestFile: src/main/java/utils/requestBody.json and Expected key: stage & expectedValue: DATA_UPDATE_SUCCESS, Expected status code: 200
#      | h:stage                   |
#      | DATA_UPDATE_SUCCESS   |