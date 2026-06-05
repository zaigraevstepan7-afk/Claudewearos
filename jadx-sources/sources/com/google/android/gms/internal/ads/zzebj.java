package com.google.android.gms.internal.ads;

import android.app.Activity;
import pc.i;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzebj extends zzecf {
    private final Activity zza;
    private final i zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzebj(Activity activity, i iVar, String str, String str2, zzebi zzebiVar) {
        this.zza = activity;
        this.zzb = iVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        i iVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzecf) {
            zzecf zzecfVar = (zzecf) obj;
            if (this.zza.equals(zzecfVar.zza()) && ((iVar = this.zzb) != null ? iVar.equals(zzecfVar.zzb()) : zzecfVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzecfVar.zzc()) : zzecfVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzecfVar.zzd()) : zzecfVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        i iVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003;
        String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = m1.m("OfflineUtilsParams{activity=", this.zza.toString(), ", adOverlay=", String.valueOf(this.zzb), ", gwsQueryId=");
        sbM.append(this.zzc);
        sbM.append(", uri=");
        return m6.a.j(sbM, this.zzd, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final i zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final String zzd() {
        return this.zzd;
    }
}
