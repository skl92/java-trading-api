/*
 *  Copyright 2016 Stanley Liu
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.precioustech.fxtrading.oanda.restapi;

public class OandaTestConstants {

	private OandaTestConstants() {
	}

	public static final String url = "https://api-fxtrade.oanda.com";
	public static final String streaming_url = "https://stream-fxtrade.oanda.com";
	public static String userName = "testTrader";
	public static String accessToken = "foobar";
	public static Long accountId = 123456L;
	public static Long accountId2 = 234567L;
	public static Long tradeId = 1800805337L;
	public static Long orderId = 1001L;
	public static Long transactionId = 1800806000L;
	public static double precision = 0.0001;
}
