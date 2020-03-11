package com.example.retrofitmockinterceptor.mock_response

import com.example.retrofitmockinterceptor.MockResponse
import com.example.retrofitmockinterceptor.R

class GetAccountSpecificMockSuccess : MockResponse {
    override fun fileResId() = R.raw.user_accounts_specific
    override fun statusCode() = 200
}