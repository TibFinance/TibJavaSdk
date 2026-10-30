
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Error;

import java.util.Arrays;
import java.util.Objects;

public class APIResponse {

        // The value of the first top-level key of the answer that is not one of the envelope fields below
        // (setPayloadValue). The typed response classes read their payload from rawBody, each field by its own name.
        @JsonIgnore
        private Object response;

        // True once setPayloadValue has kept a value, which can be null.
        private boolean payloadValueKept;

        @JsonProperty("CryptedSelf")
        private String cryptedSelf;

        @JsonProperty("IV")
        private String iv;

        @JsonProperty("Errors")
        private Error[] errors;

        @JsonProperty("HasError")
        private boolean hasError;

        @JsonProperty("Messages")
        private String messages;

        @JsonProperty("NodeAnswered")
        private String nodeAnswered;

        @JsonIgnore
        private String rawBody;

        public String getCryptedSelf() {
            return cryptedSelf;
        }

        public void setCryptedSelf(String cryptedSelf) {
            this.cryptedSelf = cryptedSelf;
        }

        public String getIv() {
            return iv;
        }

        public void setIv(String iv) {
            this.iv = iv;
        }

        public Error[] getErrors() {
            return errors;
        }

        public void setErrors(Error[] errors) {
            this.errors = errors;
        }

        public boolean isHasError() {
            return hasError;
        }

        public void setHasError(boolean hasError) {
            this.hasError = hasError;
        }

        public String getMessages() {
            return messages;
        }

        public void setMessages(String messages) {
            this.messages = messages;
        }

        public String getNodeAnswered() {
            return nodeAnswered;
        }

        public void setNodeAnswered(String nodeAnswered) {
            this.nodeAnswered = nodeAnswered;
        }

        /**
         * Returns the value of the first top-level key of the answer that is not an envelope field, null included.
         *
         * @return that value
         * @deprecated Since 3.1.0. Read the typed response that Portal returns: when an answer carries more than one
         * such key, only the first one is kept here.
         */
        @Deprecated
        public Object getResponse() {
            return response;
        }

        /**
         * @param response the value
         * @deprecated Since 3.1.0, with {@link #getResponse()}. The typed response classes read
         * {@link #getRawBody()} only, so a value set here does not reach them.
         */
        @Deprecated
        public void setResponse(Object response) {
            this.response = response;
        }

        @JsonAnySetter
        private void setPayloadValue(String name, Object value) {
            if (!payloadValueKept) {
                payloadValueKept = true;
                this.response = value;
            }
        }

        public String getRawBody() {
            return rawBody;
        }

        public void setRawBody(String rawBody) {
            this.rawBody = rawBody;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            APIResponse that = (APIResponse) o;
            return hasError == that.hasError &&
                Objects.equals(response, that.response) &&
                Objects.equals(cryptedSelf, that.cryptedSelf) &&
                Objects.equals(iv, that.iv) &&
                Arrays.equals(errors, that.errors) &&
                Objects.equals(messages, that.messages) &&
                Objects.equals(nodeAnswered, that.nodeAnswered);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(response, cryptedSelf, iv, hasError, messages, nodeAnswered);
            result = 31 * result + Arrays.hashCode(errors);
            return result;
        }

        @Override
        public String toString() {
            return "APIResponse{" +
                    "response=" + (response == null ? null : "***") +
                    ", cryptedSelf='" + cryptedSelf + '\'' +
                    ", iv='" + iv + '\'' +
                    ", errors=" + Arrays.toString(errors) +
                    ", hasError=" + hasError +
                    ", messages='" + messages + '\'' +
                    ", nodeAnswered='" + nodeAnswered + '\'' +
                    '}';
        }
    }
