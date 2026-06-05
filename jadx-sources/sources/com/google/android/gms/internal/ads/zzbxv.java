package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxv extends od.a {
    public static final Parcelable.Creator<zzbxv> CREATOR = new zzbxw();
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public zzbxv(String str, String str2, boolean z2, boolean z10, List list, boolean z11, boolean z12, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z2;
        this.zzd = z10;
        this.zze = list;
        this.zzf = z11;
        this.zzg = z12;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static zzbxv zza(JSONObject jSONObject) {
        return new zzbxv(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), hj.a.U(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), hj.a.U(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 2, str, false);
        uk.c.c0(parcel, 3, this.zzb, false);
        boolean z2 = this.zzc;
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = this.zzd;
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        uk.c.e0(parcel, 6, this.zze);
        boolean z11 = this.zzf;
        uk.c.k0(parcel, 7, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.zzg;
        uk.c.k0(parcel, 8, 4);
        parcel.writeInt(z12 ? 1 : 0);
        uk.c.e0(parcel, 9, this.zzh);
        uk.c.j0(iH0, parcel);
    }
}
