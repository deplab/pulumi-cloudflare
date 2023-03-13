// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("cloudflare");

/**
 * Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
 * environment variable.
 */
export declare const apiBasePath: string | undefined;
Object.defineProperty(exports, "apiBasePath", {
    get() {
        return __config.get("apiBasePath");
    },
    enumerable: true,
});

/**
 * Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
 * the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
 */
export declare const apiClientLogging: boolean;
Object.defineProperty(exports, "apiClientLogging", {
    get() {
        return __config.getObject<boolean>("apiClientLogging") ?? (utilities.getEnvBoolean("CLOUDFLARE_API_CLIENT_LOGGING") || false);
    },
    enumerable: true,
});

/**
 * Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
 * environment variable.
 */
export declare const apiHostname: string | undefined;
Object.defineProperty(exports, "apiHostname", {
    get() {
        return __config.get("apiHostname");
    },
    enumerable: true,
});

/**
 * The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
 * keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/api/keys/#limitations), API tokens
 * should be used instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
 */
export declare const apiKey: string | undefined;
Object.defineProperty(exports, "apiKey", {
    get() {
        return __config.get("apiKey");
    },
    enumerable: true,
});

/**
 * The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
 * Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
 */
export declare const apiToken: string | undefined;
Object.defineProperty(exports, "apiToken", {
    get() {
        return __config.get("apiToken");
    },
    enumerable: true,
});

/**
 * A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
 * `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
 * `api_user_service_key`.
 */
export declare const apiUserServiceKey: string | undefined;
Object.defineProperty(exports, "apiUserServiceKey", {
    get() {
        return __config.get("apiUserServiceKey");
    },
    enumerable: true,
});

/**
 * A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
 * variable. Required when using `api_key`. Conflicts with `api_token`.
 */
export declare const email: string | undefined;
Object.defineProperty(exports, "email", {
    get() {
        return __config.get("email");
    },
    enumerable: true,
});

/**
 * Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
 * `CLOUDFLARE_MAX_BACKOFF` environment variable.
 */
export declare const maxBackoff: number;
Object.defineProperty(exports, "maxBackoff", {
    get() {
        return __config.getObject<number>("maxBackoff") ?? (utilities.getEnvNumber("CLOUDFLARE_MAX_BACKOFF") || 30);
    },
    enumerable: true,
});

/**
 * Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
 * `CLOUDFLARE_MIN_BACKOFF` environment variable.
 */
export declare const minBackoff: number;
Object.defineProperty(exports, "minBackoff", {
    get() {
        return __config.getObject<number>("minBackoff") ?? (utilities.getEnvNumber("CLOUDFLARE_MIN_BACKOFF") || 1);
    },
    enumerable: true,
});

/**
 * Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
 * `CLOUDFLARE_RETRIES` environment variable.
 */
export declare const retries: number;
Object.defineProperty(exports, "retries", {
    get() {
        return __config.getObject<number>("retries") ?? (utilities.getEnvNumber("CLOUDFLARE_RETRIES") || 3);
    },
    enumerable: true,
});

/**
 * RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
 * variable.
 */
export declare const rps: number;
Object.defineProperty(exports, "rps", {
    get() {
        return __config.getObject<number>("rps") ?? (utilities.getEnvNumber("CLOUDFLARE_RPS") || 4);
    },
    enumerable: true,
});

