// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class EmailRoutingCatchAllActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of supported action. Available values: `drop`, `forward`, `worker`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// A list with items in the following form.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public EmailRoutingCatchAllActionGetArgs()
        {
        }
        public static new EmailRoutingCatchAllActionGetArgs Empty => new EmailRoutingCatchAllActionGetArgs();
    }
}
