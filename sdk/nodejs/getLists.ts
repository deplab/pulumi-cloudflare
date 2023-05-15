// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to lookup [Lists](https://developers.cloudflare.com/api/operations/lists-get-lists).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getLists({
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 * });
 * ```
 */
export function getLists(args: GetListsArgs, opts?: pulumi.InvokeOptions): Promise<GetListsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getLists:getLists", {
        "accountId": args.accountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getLists.
 */
export interface GetListsArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: string;
}

/**
 * A collection of values returned by getLists.
 */
export interface GetListsResult {
    /**
     * The account identifier to target for the resource.
     */
    readonly accountId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly lists: outputs.GetListsList[];
}
/**
 * Use this data source to lookup [Lists](https://developers.cloudflare.com/api/operations/lists-get-lists).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getLists({
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 * });
 * ```
 */
export function getListsOutput(args: GetListsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetListsResult> {
    return pulumi.output(args).apply((a: any) => getLists(a, opts))
}

/**
 * A collection of arguments for invoking getLists.
 */
export interface GetListsOutputArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
}