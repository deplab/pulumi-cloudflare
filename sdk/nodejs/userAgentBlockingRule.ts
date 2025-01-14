// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a resource to manage User Agent Blocking Rules.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example1 = new cloudflare.UserAgentBlockingRule("example1", {
 *     configuration: {
 *         target: "ua",
 *         value: "Chrome",
 *     },
 *     description: "My description 1",
 *     mode: "js_challenge",
 *     paused: false,
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * const example2 = new cloudflare.UserAgentBlockingRule("example2", {
 *     configuration: {
 *         target: "ua",
 *         value: "Mozilla",
 *     },
 *     description: "My description 22",
 *     mode: "challenge",
 *     paused: true,
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule example <zone_id>/<user_agent_blocking_rule_id>
 * ```
 */
export class UserAgentBlockingRule extends pulumi.CustomResource {
    /**
     * Get an existing UserAgentBlockingRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserAgentBlockingRuleState, opts?: pulumi.CustomResourceOptions): UserAgentBlockingRule {
        return new UserAgentBlockingRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule';

    /**
     * Returns true if the given object is an instance of UserAgentBlockingRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserAgentBlockingRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserAgentBlockingRule.__pulumiType;
    }

    /**
     * The configuration object for the current rule.
     */
    public readonly configuration!: pulumi.Output<outputs.UserAgentBlockingRuleConfiguration>;
    /**
     * An informative summary of the rule.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The action to apply to a matched request. Available values: `block`, `challenge`, `jsChallenge`, `managedChallenge`.
     */
    public readonly mode!: pulumi.Output<string>;
    /**
     * When true, indicates that the rule is currently paused.
     */
    public readonly paused!: pulumi.Output<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a UserAgentBlockingRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserAgentBlockingRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserAgentBlockingRuleArgs | UserAgentBlockingRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserAgentBlockingRuleState | undefined;
            resourceInputs["configuration"] = state ? state.configuration : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["mode"] = state ? state.mode : undefined;
            resourceInputs["paused"] = state ? state.paused : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as UserAgentBlockingRuleArgs | undefined;
            if ((!args || args.configuration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configuration'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.mode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mode'");
            }
            if ((!args || args.paused === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paused'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["configuration"] = args ? args.configuration : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["mode"] = args ? args.mode : undefined;
            resourceInputs["paused"] = args ? args.paused : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserAgentBlockingRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserAgentBlockingRule resources.
 */
export interface UserAgentBlockingRuleState {
    /**
     * The configuration object for the current rule.
     */
    configuration?: pulumi.Input<inputs.UserAgentBlockingRuleConfiguration>;
    /**
     * An informative summary of the rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The action to apply to a matched request. Available values: `block`, `challenge`, `jsChallenge`, `managedChallenge`.
     */
    mode?: pulumi.Input<string>;
    /**
     * When true, indicates that the rule is currently paused.
     */
    paused?: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserAgentBlockingRule resource.
 */
export interface UserAgentBlockingRuleArgs {
    /**
     * The configuration object for the current rule.
     */
    configuration: pulumi.Input<inputs.UserAgentBlockingRuleConfiguration>;
    /**
     * An informative summary of the rule.
     */
    description: pulumi.Input<string>;
    /**
     * The action to apply to a matched request. Available values: `block`, `challenge`, `jsChallenge`, `managedChallenge`.
     */
    mode: pulumi.Input<string>;
    /**
     * When true, indicates that the rule is currently paused.
     */
    paused: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
