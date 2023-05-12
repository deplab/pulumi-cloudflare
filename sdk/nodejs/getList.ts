// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to lookup a [List](https://developers.cloudflare.com/api/operations/lists-get-lists).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getList({
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "list_name",
 * });
 * ```
 */
export function getList(args: GetListArgs, opts?: pulumi.InvokeOptions): Promise<GetListResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getList:getList", {
        "accountId": args.accountId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getList.
 */
export interface GetListArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: string;
    /**
     * The list name to target for the resource.
     */
    name: string;
}

/**
 * A collection of values returned by getList.
 */
export interface GetListResult {
    /**
     * The account identifier to target for the resource.
     */
    readonly accountId: string;
    /**
     * List description.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * List kind.
     */
    readonly kind: string;
    /**
     * The list name to target for the resource.
     */
    readonly name: string;
    /**
     * Number of items in list.
     */
    readonly numitems: number;
}
/**
 * Use this data source to lookup a [List](https://developers.cloudflare.com/api/operations/lists-get-lists).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getList({
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "list_name",
 * });
 * ```
 */
export function getListOutput(args: GetListOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetListResult> {
    return pulumi.output(args).apply((a: any) => getList(a, opts))
}

/**
 * A collection of arguments for invoking getList.
 */
export interface GetListOutputArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * The list name to target for the resource.
     */
    name: pulumi.Input<string>;
}
