package com.example.retrofitmockinterceptor.mock_response

import com.example.retrofitmockinterceptor.MockResponse
import com.example.retrofitmockinterceptor.R

class GetTestMock3Success: MockResponse {
    override fun statusCode(): Int {
        return 200
    }

    override fun fileResId(): Int {
        return R.raw.test_mock_get_success_3
    }
}