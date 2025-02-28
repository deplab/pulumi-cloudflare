// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.HealthcheckHeaderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HealthcheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthcheckArgs Empty = new HealthcheckArgs();

    /**
     * The hostname or IP address of the origin server to run health checks on.
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The hostname or IP address of the origin server to run health checks on.
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
     * 
     */
    @Import(name="allowInsecure")
    private @Nullable Output<Boolean> allowInsecure;

    /**
     * @return Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> allowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }

    /**
     * A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
     * 
     */
    @Import(name="checkRegions")
    private @Nullable Output<List<String>> checkRegions;

    /**
     * @return A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
     * 
     */
    public Optional<Output<List<String>>> checkRegions() {
        return Optional.ofNullable(this.checkRegions);
    }

    /**
     * The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
     * 
     */
    @Import(name="consecutiveFails")
    private @Nullable Output<Integer> consecutiveFails;

    /**
     * @return The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> consecutiveFails() {
        return Optional.ofNullable(this.consecutiveFails);
    }

    /**
     * The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
     * 
     */
    @Import(name="consecutiveSuccesses")
    private @Nullable Output<Integer> consecutiveSuccesses;

    /**
     * @return The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> consecutiveSuccesses() {
        return Optional.ofNullable(this.consecutiveSuccesses);
    }

    /**
     * A human-readable description of the health check.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A human-readable description of the health check.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
     * 
     */
    @Import(name="expectedBody")
    private @Nullable Output<String> expectedBody;

    /**
     * @return A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
     * 
     */
    public Optional<Output<String>> expectedBody() {
        return Optional.ofNullable(this.expectedBody);
    }

    /**
     * The expected HTTP response codes (e.g. &#39;200&#39;) or code ranges (e.g. &#39;2xx&#39; for all codes starting with 2) of the health check.
     * 
     */
    @Import(name="expectedCodes")
    private @Nullable Output<List<String>> expectedCodes;

    /**
     * @return The expected HTTP response codes (e.g. &#39;200&#39;) or code ranges (e.g. &#39;2xx&#39; for all codes starting with 2) of the health check.
     * 
     */
    public Optional<Output<List<String>>> expectedCodes() {
        return Optional.ofNullable(this.expectedCodes);
    }

    /**
     * Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
     * 
     */
    @Import(name="followRedirects")
    private @Nullable Output<Boolean> followRedirects;

    /**
     * @return Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> followRedirects() {
        return Optional.ofNullable(this.followRedirects);
    }

    /**
     * The header name.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<HealthcheckHeaderArgs>> headers;

    /**
     * @return The header name.
     * 
     */
    public Optional<Output<List<HealthcheckHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The HTTP method to use for the health check. Available values: `connection_established`, `GET`, `HEAD`.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return The HTTP method to use for the health check. Available values: `connection_established`, `GET`, `HEAD`.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The endpoint path to health check against. Defaults to `/`.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The endpoint path to health check against. Defaults to `/`.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Port number to connect to for the health check. Defaults to `80`.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port number to connect to for the health check. Defaults to `80`.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     * 
     */
    @Import(name="retries")
    private @Nullable Output<Integer> retries;

    /**
     * @return The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     * 
     */
    public Optional<Output<Integer>> retries() {
        return Optional.ofNullable(this.retries);
    }

    /**
     * If suspended, no health checks are sent to the origin. Defaults to `false`.
     * 
     */
    @Import(name="suspended")
    private @Nullable Output<Boolean> suspended;

    /**
     * @return If suspended, no health checks are sent to the origin. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> suspended() {
        return Optional.ofNullable(this.suspended);
    }

    /**
     * The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private HealthcheckArgs() {}

    private HealthcheckArgs(HealthcheckArgs $) {
        this.address = $.address;
        this.allowInsecure = $.allowInsecure;
        this.checkRegions = $.checkRegions;
        this.consecutiveFails = $.consecutiveFails;
        this.consecutiveSuccesses = $.consecutiveSuccesses;
        this.description = $.description;
        this.expectedBody = $.expectedBody;
        this.expectedCodes = $.expectedCodes;
        this.followRedirects = $.followRedirects;
        this.headers = $.headers;
        this.interval = $.interval;
        this.method = $.method;
        this.name = $.name;
        this.path = $.path;
        this.port = $.port;
        this.retries = $.retries;
        this.suspended = $.suspended;
        this.timeout = $.timeout;
        this.type = $.type;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthcheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthcheckArgs $;

        public Builder() {
            $ = new HealthcheckArgs();
        }

        public Builder(HealthcheckArgs defaults) {
            $ = new HealthcheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The hostname or IP address of the origin server to run health checks on.
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The hostname or IP address of the origin server to run health checks on.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param allowInsecure Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            $.allowInsecure = allowInsecure;
            return this;
        }

        /**
         * @param allowInsecure Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(Boolean allowInsecure) {
            return allowInsecure(Output.of(allowInsecure));
        }

        /**
         * @param checkRegions A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
         * 
         * @return builder
         * 
         */
        public Builder checkRegions(@Nullable Output<List<String>> checkRegions) {
            $.checkRegions = checkRegions;
            return this;
        }

        /**
         * @param checkRegions A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
         * 
         * @return builder
         * 
         */
        public Builder checkRegions(List<String> checkRegions) {
            return checkRegions(Output.of(checkRegions));
        }

        /**
         * @param checkRegions A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
         * 
         * @return builder
         * 
         */
        public Builder checkRegions(String... checkRegions) {
            return checkRegions(List.of(checkRegions));
        }

        /**
         * @param consecutiveFails The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveFails(@Nullable Output<Integer> consecutiveFails) {
            $.consecutiveFails = consecutiveFails;
            return this;
        }

        /**
         * @param consecutiveFails The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveFails(Integer consecutiveFails) {
            return consecutiveFails(Output.of(consecutiveFails));
        }

        /**
         * @param consecutiveSuccesses The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveSuccesses(@Nullable Output<Integer> consecutiveSuccesses) {
            $.consecutiveSuccesses = consecutiveSuccesses;
            return this;
        }

        /**
         * @param consecutiveSuccesses The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveSuccesses(Integer consecutiveSuccesses) {
            return consecutiveSuccesses(Output.of(consecutiveSuccesses));
        }

        /**
         * @param description A human-readable description of the health check.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human-readable description of the health check.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expectedBody A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
         * 
         * @return builder
         * 
         */
        public Builder expectedBody(@Nullable Output<String> expectedBody) {
            $.expectedBody = expectedBody;
            return this;
        }

        /**
         * @param expectedBody A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
         * 
         * @return builder
         * 
         */
        public Builder expectedBody(String expectedBody) {
            return expectedBody(Output.of(expectedBody));
        }

        /**
         * @param expectedCodes The expected HTTP response codes (e.g. &#39;200&#39;) or code ranges (e.g. &#39;2xx&#39; for all codes starting with 2) of the health check.
         * 
         * @return builder
         * 
         */
        public Builder expectedCodes(@Nullable Output<List<String>> expectedCodes) {
            $.expectedCodes = expectedCodes;
            return this;
        }

        /**
         * @param expectedCodes The expected HTTP response codes (e.g. &#39;200&#39;) or code ranges (e.g. &#39;2xx&#39; for all codes starting with 2) of the health check.
         * 
         * @return builder
         * 
         */
        public Builder expectedCodes(List<String> expectedCodes) {
            return expectedCodes(Output.of(expectedCodes));
        }

        /**
         * @param expectedCodes The expected HTTP response codes (e.g. &#39;200&#39;) or code ranges (e.g. &#39;2xx&#39; for all codes starting with 2) of the health check.
         * 
         * @return builder
         * 
         */
        public Builder expectedCodes(String... expectedCodes) {
            return expectedCodes(List.of(expectedCodes));
        }

        /**
         * @param followRedirects Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder followRedirects(@Nullable Output<Boolean> followRedirects) {
            $.followRedirects = followRedirects;
            return this;
        }

        /**
         * @param followRedirects Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder followRedirects(Boolean followRedirects) {
            return followRedirects(Output.of(followRedirects));
        }

        /**
         * @param headers The header name.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<HealthcheckHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers The header name.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<HealthcheckHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers The header name.
         * 
         * @return builder
         * 
         */
        public Builder headers(HealthcheckHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param interval The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param method The HTTP method to use for the health check. Available values: `connection_established`, `GET`, `HEAD`.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The HTTP method to use for the health check. Available values: `connection_established`, `GET`, `HEAD`.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param name A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The endpoint path to health check against. Defaults to `/`.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The endpoint path to health check against. Defaults to `/`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port Port number to connect to for the health check. Defaults to `80`.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port number to connect to for the health check. Defaults to `80`.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param retries The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
         * 
         * @return builder
         * 
         */
        public Builder retries(@Nullable Output<Integer> retries) {
            $.retries = retries;
            return this;
        }

        /**
         * @param retries The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
         * 
         * @return builder
         * 
         */
        public Builder retries(Integer retries) {
            return retries(Output.of(retries));
        }

        /**
         * @param suspended If suspended, no health checks are sent to the origin. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder suspended(@Nullable Output<Boolean> suspended) {
            $.suspended = suspended;
            return this;
        }

        /**
         * @param suspended If suspended, no health checks are sent to the origin. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder suspended(Boolean suspended) {
            return suspended(Output.of(suspended));
        }

        /**
         * @param timeout The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param type The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public HealthcheckArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
