// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to look up [WAF Rules](https://api.cloudflare.com/#waf-rule-groups-properties).
 */
export function getWafRules(args: GetWafRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetWafRulesResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("cloudflare:index/getWafRules:getWafRules", {
        "filter": args.filter,
        "packageId": args.packageId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWafRules.
 */
export interface GetWafRulesArgs {
    /**
     * One or more values used to look up WAF Rules. If more than one value is given all
     * values must match in order to be included, see below for full list.
     */
    filter?: inputs.GetWafRulesFilter;
    /**
     * The ID of the WAF Rule Package in which to search for the WAF Rules.
     */
    packageId?: string;
    /**
     * The ID of the DNS zone in which to search for the WAF Rules.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getWafRules.
 */
export interface GetWafRulesResult {
    readonly filter?: outputs.GetWafRulesFilter;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ID of the WAF Rule Package that contains the WAF Rule
     */
    readonly packageId?: string;
    /**
     * A map of WAF Rules details. Full list below:
     */
    readonly rules: outputs.GetWafRulesRule[];
    readonly zoneId: string;
}

export function getWafRulesOutput(args: GetWafRulesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWafRulesResult> {
    return pulumi.output(args).apply(a => getWafRules(a, opts))
}

/**
 * A collection of arguments for invoking getWafRules.
 */
export interface GetWafRulesOutputArgs {
    /**
     * One or more values used to look up WAF Rules. If more than one value is given all
     * values must match in order to be included, see below for full list.
     */
    filter?: pulumi.Input<inputs.GetWafRulesFilterArgs>;
    /**
     * The ID of the WAF Rule Package in which to search for the WAF Rules.
     */
    packageId?: pulumi.Input<string>;
    /**
     * The ID of the DNS zone in which to search for the WAF Rules.
     */
    zoneId: pulumi.Input<string>;
}
