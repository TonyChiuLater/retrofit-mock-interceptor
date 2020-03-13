package com.example.retrofitmockinterceptor.mock_response

import com.example.retrofitmockinterceptor.MockResponse
import com.example.retrofitmockinterceptor.R

class GetAccountSpecificMockSuccess : MockResponse {
    override fun statusCode(): Int {
        return 200
    }

    override fun fileResId(): Int {
        return R.raw.user_accounts_specific
    }
}