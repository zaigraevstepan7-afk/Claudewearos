package com.google.android.gms.internal.ads;

import org.json.JSONException;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbeg extends zc.b {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbeh zzb;

    public zzbeg(zzbeh zzbehVar, String str) {
        this.zza = str;
        this.zzb = zzbehVar;
    }

    @Override // zc.b
    public final void onFailure(String str) {
        int i10 = l0.f13401b;
        k.g("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbeh zzbehVar = this.zzb;
            zzbehVar.zzg.a(zzbehVar.zzc(this.zza, str).toString());
        } catch (JSONException e10) {
            k.e("Error creating PACT Error Response JSON: ", e10);
        }
    }

    @Override // zc.b
    public final void onSuccess(zc.a aVar) {
        String str = aVar.f20492a.f6649a;
        try {
            zzbeh zzbehVar = this.zzb;
            zzbehVar.zzg.a(zzbehVar.zzd(this.zza, str).toString());
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.e("Error creating PACT Signal Response JSON: ", e10);
        }
    }
}
