/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.trino.plugin.kudu;

public class KuduSmokeTests
{
    private static final String KUDU_VERSION = "1.13.0";

    public static class TestKuduWithDisabledInferSchemaConnectorTest
            extends AbstractKuduWithDisabledInferSchemaConnectorTest
    {
        @Override
        protected String getKuduServerVersion()
        {
            return KUDU_VERSION;
        }
    }

    public static class TestKuduWithEmptyInferSchemaConnectorTest
            extends AbstractKuduWithEmptyInferSchemaConnectorTest
    {
        @Override
        protected String getKuduServerVersion()
        {
            return KUDU_VERSION;
        }
    }

    public static class TestKuduSmokeTestWithStandardInferSchema
            extends AbstractKuduWithStandardInferSchemaConnectorTest
    {
        @Override
        protected String getKuduServerVersion()
        {
            return KUDU_VERSION;
        }
    }
}
