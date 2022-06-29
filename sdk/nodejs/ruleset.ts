// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Magic Transit
 * const magicTransitExample = new cloudflare.Ruleset("magic_transit_example", {
 *     accountId: "d41d8cd98f00b204e9800998ecf8427e",
 *     description: "example magic transit ruleset description",
 *     kind: "root",
 *     name: "account magic transit",
 *     phase: "magic_transit",
 *     rules: [{
 *         action: "allow",
 *         description: "Allow TCP Ephemeral Ports",
 *         expression: "tcp.dstport in { 32768..65535 }",
 *     }],
 * });
 * // Zone-level WAF Managed Ruleset
 * const zoneLevelManagedWaf = new cloudflare.Ruleset("zone_level_managed_waf", {
 *     description: "managed WAF ruleset description",
 *     kind: "zone",
 *     name: "managed WAF",
 *     phase: "http_request_firewall_managed",
 *     rules: [{
 *         action: "execute",
 *         actionParameters: {
 *             id: "efb7b8c949ac4650a09736fc376e9aee",
 *         },
 *         description: "Execute Cloudflare Managed Ruleset on my zone-level phase entry point ruleset",
 *         enabled: true,
 *         expression: "true",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // Zone-level WAF with tag-based overrides
 * const zoneLevelManagedWafWithCategoryBasedOverrides = new cloudflare.Ruleset("zone_level_managed_waf_with_category_based_overrides", {
 *     description: "managed WAF with tag-based overrides ruleset description",
 *     kind: "zone",
 *     name: "managed WAF with tag-based overrides",
 *     phase: "http_request_firewall_managed",
 *     rules: [{
 *         action: "execute",
 *         actionParameters: {
 *             id: "efb7b8c949ac4650a09736fc376e9aee",
 *             overrides: {
 *                 categories: [
 *                     {
 *                         action: "block",
 *                         category: "wordpress",
 *                         status: "enabled",
 *                     },
 *                     {
 *                         action: "block",
 *                         category: "joomla",
 *                         status: "enabled",
 *                     },
 *                 ],
 *             },
 *         },
 *         description: "overrides to only enable wordpress rules to block",
 *         enabled: false,
 *         expression: "true",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // Rewrite the URI path component to a static path
 * const transformUriRulePath = new cloudflare.Ruleset("transform_uri_rule_path", {
 *     description: "change the URI path to a new static path",
 *     kind: "zone",
 *     name: "transform rule for URI path",
 *     phase: "http_request_transform",
 *     rules: [{
 *         action: "rewrite",
 *         actionParameters: {
 *             uri: {
 *                 path: {
 *                     value: "/my-new-route",
 *                 },
 *             },
 *         },
 *         description: "example URI path transform rule",
 *         enabled: true,
 *         expression: "(http.host eq \"example.com\" and http.request.uri.path eq \"/old-path\")",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // Rewrite the URI query component to a static query
 * const transformUriRuleQuery = new cloudflare.Ruleset("transform_uri_rule_query", {
 *     description: "change the URI query to a new static query",
 *     kind: "zone",
 *     name: "transform rule for URI query parameter",
 *     phase: "http_request_transform",
 *     rules: [{
 *         action: "rewrite",
 *         actionParameters: {
 *             uri: {
 *                 query: {
 *                     value: "old=new_again",
 *                 },
 *             },
 *         },
 *         description: "URI transformation query example",
 *         enabled: true,
 *         expression: "true",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // Rewrite HTTP headers to a modified values
 * const transformUriHttpHeaders = new cloudflare.Ruleset("transform_uri_http_headers", {
 *     description: "modify HTTP headers before reaching origin",
 *     kind: "zone",
 *     name: "transform rule for HTTP headers",
 *     phase: "http_request_late_transform",
 *     rules: [{
 *         action: "rewrite",
 *         actionParameters: {
 *             headers: [
 *                 {
 *                     name: "example-http-header-1",
 *                     operation: "set",
 *                     value: "my-http-header-value-1",
 *                 },
 *                 {
 *                     expression: "cf.zone.name",
 *                     name: "example-http-header-2",
 *                     operation: "set",
 *                 },
 *                 {
 *                     name: "example-http-header-3-to-remove",
 *                     operation: "remove",
 *                 },
 *             ],
 *         },
 *         description: "example request header transform rule",
 *         enabled: false,
 *         expression: "true",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // HTTP rate limit for an API route
 * const rateLimitingExample = new cloudflare.Ruleset("rate_limiting_example", {
 *     description: "apply HTTP rate limiting for a route",
 *     kind: "zone",
 *     name: "restrict API requests count",
 *     phase: "http_ratelimit",
 *     rules: [{
 *         action: "block",
 *         description: "rate limit for API",
 *         enabled: true,
 *         expression: "(http.request.uri.path matches \"^/api/\")",
 *         ratelimit: {
 *             characteristics: [
 *                 "cf.colo.id",
 *                 "ip.src",
 *             ],
 *             mitigationTimeout: 600,
 *             period: 60,
 *             requestsPerPeriod: 100,
 *         },
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // Change origin for an API route
 * const httpOriginExample = new cloudflare.Ruleset("http_origin_example", {
 *     description: "Change origin for a route",
 *     kind: "zone",
 *     name: "Change to some origin",
 *     phase: "http_request_origin",
 *     rules: [{
 *         action: "route",
 *         actionParameters: {
 *             hostHeader: "some.host",
 *             origin: {
 *                 host: "some.host",
 *                 port: 80,
 *             },
 *         },
 *         description: "change origin to some.host",
 *         enabled: true,
 *         expression: "(http.request.uri.path matches \"^/api/\")",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // Custom fields logging
 * const customFieldsLoggingExample = new cloudflare.Ruleset("custom_fields_logging_example", {
 *     description: "add custom fields to logging",
 *     kind: "zone",
 *     name: "log custom fields",
 *     phase: "http_log_custom_fields",
 *     rules: [{
 *         action: "log_custom_field",
 *         actionParameters: {
 *             cookieFields: [
 *                 "__ga",
 *                 "accountNumber",
 *                 "__cfruid",
 *             ],
 *             requestFields: [
 *                 "content-type",
 *                 "x-forwarded-for",
 *                 "host",
 *             ],
 *             responseFields: [
 *                 "server",
 *                 "content-type",
 *                 "allow",
 *             ],
 *         },
 *         description: "log custom fields rule",
 *         enabled: true,
 *         expression: "true",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * const cacheSettingsExample = new cloudflare.Ruleset("cache_settings_example", {
 *     description: "set cache settings for the request",
 *     kind: "zone",
 *     name: "set cache settings",
 *     phase: "http_request_cache_settings",
 *     rules: [{
 *         action: "set_cache_settings",
 *         actionParameters: {
 *             browserTtl: {
 *                 mode: "respect_origin",
 *             },
 *             cacheKey: {
 *                 cacheDeceptionArmor: true,
 *                 customKey: {
 *                     cookie: {
 *                         checkPresences: [
 *                             "cabc_t",
 *                             "cdef_t",
 *                         ],
 *                         includes: [
 *                             "cabc",
 *                             "cdef",
 *                         ],
 *                     },
 *                     header: {
 *                         checkPresences: [
 *                             "habc_t",
 *                             "hdef_t",
 *                         ],
 *                         excludeOrigin: true,
 *                         includes: [
 *                             "habc",
 *                             "hdef",
 *                         ],
 *                     },
 *                     host: {
 *                         resolved: true,
 *                     },
 *                     queryString: {
 *                         excludes: ["*"],
 *                     },
 *                     user: {
 *                         deviceType: true,
 *                         geo: false,
 *                     },
 *                 },
 *                 ignoreQueryStringsOrder: false,
 *             },
 *             edgeTtl: {
 *                 default: 60,
 *                 mode: "override_origin",
 *                 statusCodeTtls: [
 *                     {
 *                         statusCode: 200,
 *                         value: 50,
 *                     },
 *                     {
 *                         statusCodeRanges: [{
 *                             from: 201,
 *                             to: 300,
 *                         }],
 *                         value: 30,
 *                     },
 *                 ],
 *             },
 *             originErrorPagePassthru: false,
 *             respectStrongEtags: true,
 *             serveStale: {
 *                 disableStaleWhileUpdating: true,
 *             },
 *         },
 *         description: "set cache settings rule",
 *         enabled: true,
 *         expression: "true",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * ```
 *
 * ## Import
 *
 * Import is not supported for this resource.
 */
export class Ruleset extends pulumi.CustomResource {
    /**
     * Get an existing Ruleset resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RulesetState, opts?: pulumi.CustomResourceOptions): Ruleset {
        return new Ruleset(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/ruleset:Ruleset';

    /**
     * Returns true if the given object is an instance of Ruleset.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Ruleset {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Ruleset.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * Brief summary of the ruleset and its intended use.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`
     */
    public readonly kind!: pulumi.Output<string>;
    /**
     * Name of the ruleset.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`,
     * `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`,
     * `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`,
     * `http_request_main`, `http_request_origin`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`,
     * `http_response_firewall_managed`, `http_response_headers_transform`, `magic_transit`, `http_ratelimit`,
     * `http_request_sbfm`
     */
    public readonly phase!: pulumi.Output<string>;
    /**
     * List of rules to apply to the ruleset.
     */
    public readonly rules!: pulumi.Output<outputs.RulesetRule[] | undefined>;
    /**
     * Name of entitlement that is shareable between entities.
     */
    public readonly shareableEntitlementName!: pulumi.Output<string | undefined>;
    /**
     * The zone identifier to target for the resource.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a Ruleset resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RulesetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RulesetArgs | RulesetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RulesetState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["phase"] = state ? state.phase : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["shareableEntitlementName"] = state ? state.shareableEntitlementName : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as RulesetArgs | undefined;
            if ((!args || args.kind === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kind'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.phase === undefined) && !opts.urn) {
                throw new Error("Missing required property 'phase'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["kind"] = args ? args.kind : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["phase"] = args ? args.phase : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["shareableEntitlementName"] = args ? args.shareableEntitlementName : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Ruleset.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Ruleset resources.
 */
export interface RulesetState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Brief summary of the ruleset and its intended use.
     */
    description?: pulumi.Input<string>;
    /**
     * Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`
     */
    kind?: pulumi.Input<string>;
    /**
     * Name of the ruleset.
     */
    name?: pulumi.Input<string>;
    /**
     * Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`,
     * `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`,
     * `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`,
     * `http_request_main`, `http_request_origin`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`,
     * `http_response_firewall_managed`, `http_response_headers_transform`, `magic_transit`, `http_ratelimit`,
     * `http_request_sbfm`
     */
    phase?: pulumi.Input<string>;
    /**
     * List of rules to apply to the ruleset.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.RulesetRule>[]>;
    /**
     * Name of entitlement that is shareable between entities.
     */
    shareableEntitlementName?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Ruleset resource.
 */
export interface RulesetArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Brief summary of the ruleset and its intended use.
     */
    description?: pulumi.Input<string>;
    /**
     * Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`
     */
    kind: pulumi.Input<string>;
    /**
     * Name of the ruleset.
     */
    name: pulumi.Input<string>;
    /**
     * Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`,
     * `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`,
     * `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`,
     * `http_request_main`, `http_request_origin`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`,
     * `http_response_firewall_managed`, `http_response_headers_transform`, `magic_transit`, `http_ratelimit`,
     * `http_request_sbfm`
     */
    phase: pulumi.Input<string>;
    /**
     * List of rules to apply to the ruleset.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.RulesetRule>[]>;
    /**
     * Name of entitlement that is shareable between entities.
     */
    shareableEntitlementName?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}
