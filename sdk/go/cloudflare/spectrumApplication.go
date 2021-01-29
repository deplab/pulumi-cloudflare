// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare Spectrum Application. You can extend the power of Cloudflare's DDoS, TLS, and IP Firewall to your other TCP-based services.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare"
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewSpectrumApplication(ctx, "sshProxy", &cloudflare.SpectrumApplicationArgs{
// 			ZoneId:      pulumi.Any(_var.Cloudflare_zone_id),
// 			Protocol:    pulumi.String("tcp/22"),
// 			TrafficType: pulumi.String("direct"),
// 			Dns: &cloudflare.SpectrumApplicationDnsArgs{
// 				Type: pulumi.String("CNAME"),
// 				Name: pulumi.String("ssh.example.com"),
// 			},
// 			OriginDirects: pulumi.StringArray{
// 				pulumi.String("tcp://109.151.40.129:22"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Spectrum resource can be imported using a zone ID and Application ID, e.g.
//
// ```sh
//  $ pulumi import cloudflare:index/spectrumApplication:SpectrumApplication example d41d8cd98f00b204e9800998ecf8427e/9a7806061c88ada191ed06f989cc3dac
// ```
//
//  where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID, as returned from [API](https://api.cloudflare.com/#zone-list-zones) * `9a7806061c88ada191ed06f989cc3dac` - Application ID
type SpectrumApplication struct {
	pulumi.CustomResourceState

	// . Enables Argo Smart Routing. Defaults to `false`.
	ArgoSmartRouting pulumi.BoolPtrOutput `pulumi:"argoSmartRouting"`
	// The name and type of DNS record for the Spectrum application. Fields documented below.
	Dns SpectrumApplicationDnsOutput `pulumi:"dns"`
	// . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
	EdgeIpConnectivity pulumi.StringPtrOutput `pulumi:"edgeIpConnectivity"`
	// . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
	EdgeIps pulumi.StringArrayOutput `pulumi:"edgeIps"`
	// Enables the IP Firewall for this application. Defaults to `true`.
	IpFirewall pulumi.BoolPtrOutput `pulumi:"ipFirewall"`
	// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
	OriginDirects pulumi.StringArrayOutput `pulumi:"originDirects"`
	// A destination DNS addresses to the origin. Fields documented below.
	OriginDns SpectrumApplicationOriginDnsPtrOutput `pulumi:"originDns"`
	// If using `originDns` and not `originPortRange`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
	OriginPort pulumi.IntPtrOutput `pulumi:"originPort"`
	// If using `originDns` and not `originPort`, this is a required attribute. Origin port range to proxy traffice to.  When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
	OriginPortRange SpectrumApplicationOriginPortRangePtrOutput `pulumi:"originPortRange"`
	// The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
	Protocol pulumi.StringOutput `pulumi:"protocol"`
	// Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
	ProxyProtocol pulumi.StringPtrOutput `pulumi:"proxyProtocol"`
	// TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
	Tls pulumi.StringPtrOutput `pulumi:"tls"`
	// Sets application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
	TrafficType pulumi.StringPtrOutput `pulumi:"trafficType"`
	// The DNS zone ID to add the application to
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewSpectrumApplication registers a new resource with the given unique name, arguments, and options.
func NewSpectrumApplication(ctx *pulumi.Context,
	name string, args *SpectrumApplicationArgs, opts ...pulumi.ResourceOption) (*SpectrumApplication, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Dns == nil {
		return nil, errors.New("invalid value for required argument 'Dns'")
	}
	if args.Protocol == nil {
		return nil, errors.New("invalid value for required argument 'Protocol'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource SpectrumApplication
	err := ctx.RegisterResource("cloudflare:index/spectrumApplication:SpectrumApplication", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpectrumApplication gets an existing SpectrumApplication resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpectrumApplication(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpectrumApplicationState, opts ...pulumi.ResourceOption) (*SpectrumApplication, error) {
	var resource SpectrumApplication
	err := ctx.ReadResource("cloudflare:index/spectrumApplication:SpectrumApplication", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpectrumApplication resources.
type spectrumApplicationState struct {
	// . Enables Argo Smart Routing. Defaults to `false`.
	ArgoSmartRouting *bool `pulumi:"argoSmartRouting"`
	// The name and type of DNS record for the Spectrum application. Fields documented below.
	Dns *SpectrumApplicationDns `pulumi:"dns"`
	// . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
	EdgeIpConnectivity *string `pulumi:"edgeIpConnectivity"`
	// . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
	EdgeIps []string `pulumi:"edgeIps"`
	// Enables the IP Firewall for this application. Defaults to `true`.
	IpFirewall *bool `pulumi:"ipFirewall"`
	// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
	OriginDirects []string `pulumi:"originDirects"`
	// A destination DNS addresses to the origin. Fields documented below.
	OriginDns *SpectrumApplicationOriginDns `pulumi:"originDns"`
	// If using `originDns` and not `originPortRange`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
	OriginPort *int `pulumi:"originPort"`
	// If using `originDns` and not `originPort`, this is a required attribute. Origin port range to proxy traffice to.  When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
	OriginPortRange *SpectrumApplicationOriginPortRange `pulumi:"originPortRange"`
	// The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
	Protocol *string `pulumi:"protocol"`
	// Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
	ProxyProtocol *string `pulumi:"proxyProtocol"`
	// TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
	Tls *string `pulumi:"tls"`
	// Sets application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
	TrafficType *string `pulumi:"trafficType"`
	// The DNS zone ID to add the application to
	ZoneId *string `pulumi:"zoneId"`
}

type SpectrumApplicationState struct {
	// . Enables Argo Smart Routing. Defaults to `false`.
	ArgoSmartRouting pulumi.BoolPtrInput
	// The name and type of DNS record for the Spectrum application. Fields documented below.
	Dns SpectrumApplicationDnsPtrInput
	// . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
	EdgeIpConnectivity pulumi.StringPtrInput
	// . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
	EdgeIps pulumi.StringArrayInput
	// Enables the IP Firewall for this application. Defaults to `true`.
	IpFirewall pulumi.BoolPtrInput
	// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
	OriginDirects pulumi.StringArrayInput
	// A destination DNS addresses to the origin. Fields documented below.
	OriginDns SpectrumApplicationOriginDnsPtrInput
	// If using `originDns` and not `originPortRange`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
	OriginPort pulumi.IntPtrInput
	// If using `originDns` and not `originPort`, this is a required attribute. Origin port range to proxy traffice to.  When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
	OriginPortRange SpectrumApplicationOriginPortRangePtrInput
	// The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
	Protocol pulumi.StringPtrInput
	// Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
	ProxyProtocol pulumi.StringPtrInput
	// TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
	Tls pulumi.StringPtrInput
	// Sets application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
	TrafficType pulumi.StringPtrInput
	// The DNS zone ID to add the application to
	ZoneId pulumi.StringPtrInput
}

func (SpectrumApplicationState) ElementType() reflect.Type {
	return reflect.TypeOf((*spectrumApplicationState)(nil)).Elem()
}

type spectrumApplicationArgs struct {
	// . Enables Argo Smart Routing. Defaults to `false`.
	ArgoSmartRouting *bool `pulumi:"argoSmartRouting"`
	// The name and type of DNS record for the Spectrum application. Fields documented below.
	Dns SpectrumApplicationDns `pulumi:"dns"`
	// . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
	EdgeIpConnectivity *string `pulumi:"edgeIpConnectivity"`
	// . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
	EdgeIps []string `pulumi:"edgeIps"`
	// Enables the IP Firewall for this application. Defaults to `true`.
	IpFirewall *bool `pulumi:"ipFirewall"`
	// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
	OriginDirects []string `pulumi:"originDirects"`
	// A destination DNS addresses to the origin. Fields documented below.
	OriginDns *SpectrumApplicationOriginDns `pulumi:"originDns"`
	// If using `originDns` and not `originPortRange`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
	OriginPort *int `pulumi:"originPort"`
	// If using `originDns` and not `originPort`, this is a required attribute. Origin port range to proxy traffice to.  When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
	OriginPortRange *SpectrumApplicationOriginPortRange `pulumi:"originPortRange"`
	// The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
	Protocol string `pulumi:"protocol"`
	// Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
	ProxyProtocol *string `pulumi:"proxyProtocol"`
	// TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
	Tls *string `pulumi:"tls"`
	// Sets application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
	TrafficType *string `pulumi:"trafficType"`
	// The DNS zone ID to add the application to
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a SpectrumApplication resource.
type SpectrumApplicationArgs struct {
	// . Enables Argo Smart Routing. Defaults to `false`.
	ArgoSmartRouting pulumi.BoolPtrInput
	// The name and type of DNS record for the Spectrum application. Fields documented below.
	Dns SpectrumApplicationDnsInput
	// . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
	EdgeIpConnectivity pulumi.StringPtrInput
	// . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
	EdgeIps pulumi.StringArrayInput
	// Enables the IP Firewall for this application. Defaults to `true`.
	IpFirewall pulumi.BoolPtrInput
	// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
	OriginDirects pulumi.StringArrayInput
	// A destination DNS addresses to the origin. Fields documented below.
	OriginDns SpectrumApplicationOriginDnsPtrInput
	// If using `originDns` and not `originPortRange`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
	OriginPort pulumi.IntPtrInput
	// If using `originDns` and not `originPort`, this is a required attribute. Origin port range to proxy traffice to.  When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
	OriginPortRange SpectrumApplicationOriginPortRangePtrInput
	// The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
	Protocol pulumi.StringInput
	// Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
	ProxyProtocol pulumi.StringPtrInput
	// TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
	Tls pulumi.StringPtrInput
	// Sets application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
	TrafficType pulumi.StringPtrInput
	// The DNS zone ID to add the application to
	ZoneId pulumi.StringInput
}

func (SpectrumApplicationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*spectrumApplicationArgs)(nil)).Elem()
}

type SpectrumApplicationInput interface {
	pulumi.Input

	ToSpectrumApplicationOutput() SpectrumApplicationOutput
	ToSpectrumApplicationOutputWithContext(ctx context.Context) SpectrumApplicationOutput
}

func (*SpectrumApplication) ElementType() reflect.Type {
	return reflect.TypeOf((*SpectrumApplication)(nil))
}

func (i *SpectrumApplication) ToSpectrumApplicationOutput() SpectrumApplicationOutput {
	return i.ToSpectrumApplicationOutputWithContext(context.Background())
}

func (i *SpectrumApplication) ToSpectrumApplicationOutputWithContext(ctx context.Context) SpectrumApplicationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpectrumApplicationOutput)
}

type SpectrumApplicationOutput struct {
	*pulumi.OutputState
}

func (SpectrumApplicationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*SpectrumApplication)(nil))
}

func (o SpectrumApplicationOutput) ToSpectrumApplicationOutput() SpectrumApplicationOutput {
	return o
}

func (o SpectrumApplicationOutput) ToSpectrumApplicationOutputWithContext(ctx context.Context) SpectrumApplicationOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(SpectrumApplicationOutput{})
}
