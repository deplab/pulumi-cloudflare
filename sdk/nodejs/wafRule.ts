// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare WAF rule resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall rules.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const rule100000 = new cloudflare.WafRule("rule_100000", {
 *     mode: "simulate",
 *     ruleId: "100000",
 *     zoneId: "ae36f999674d196762efcc5abb06b345",
 * });
 * ```
 *
 * ## Import
 *
 * Rules can be imported using a composite ID formed of zone ID and the WAF Rule ID, e.g.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/wafRule:WafRule 100000 ae36f999674d196762efcc5abb06b345/100000
 * ```
 */
export class WafRule extends pulumi.CustomResource {
    /**
     * Get an existing WafRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WafRuleState, opts?: pulumi.CustomResourceOptions): WafRule {
        return new WafRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/wafRule:WafRule';

    /**
     * Returns true if the given object is an instance of WafRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WafRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WafRule.__pulumiType;
    }

    /**
     * The ID of the WAF Rule Group that contains the rule.
     */
    public /*out*/ readonly groupId!: pulumi.Output<string>;
    /**
     * The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
     */
    public readonly mode!: pulumi.Output<string>;
    /**
     * The ID of the WAF Rule Package that contains the rule.
     */
    public readonly packageId!: pulumi.Output<string>;
    /**
     * The WAF Rule ID.
     */
    public readonly ruleId!: pulumi.Output<string>;
    /**
     * The DNS zone ID to apply to.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a WafRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WafRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WafRuleArgs | WafRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WafRuleState | undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["mode"] = state ? state.mode : undefined;
            inputs["packageId"] = state ? state.packageId : undefined;
            inputs["ruleId"] = state ? state.ruleId : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as WafRuleArgs | undefined;
            if ((!args || args.mode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mode'");
            }
            if ((!args || args.ruleId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleId'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            inputs["mode"] = args ? args.mode : undefined;
            inputs["packageId"] = args ? args.packageId : undefined;
            inputs["ruleId"] = args ? args.ruleId : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
            inputs["groupId"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(WafRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WafRule resources.
 */
export interface WafRuleState {
    /**
     * The ID of the WAF Rule Group that contains the rule.
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
     */
    readonly mode?: pulumi.Input<string>;
    /**
     * The ID of the WAF Rule Package that contains the rule.
     */
    readonly packageId?: pulumi.Input<string>;
    /**
     * The WAF Rule ID.
     */
    readonly ruleId?: pulumi.Input<string>;
    /**
     * The DNS zone ID to apply to.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WafRule resource.
 */
export interface WafRuleArgs {
    /**
     * The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
     */
    readonly mode: pulumi.Input<string>;
    /**
     * The ID of the WAF Rule Package that contains the rule.
     */
    readonly packageId?: pulumi.Input<string>;
    /**
     * The WAF Rule ID.
     */
    readonly ruleId: pulumi.Input<string>;
    /**
     * The DNS zone ID to apply to.
     */
    readonly zoneId: pulumi.Input<string>;
}
