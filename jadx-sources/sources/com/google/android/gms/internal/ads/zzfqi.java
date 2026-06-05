package com.google.android.gms.internal.ads;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfqi extends zzfqp {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzfqi(String str, boolean z2, int i10, zzfqe zzfqeVar, zzfqf zzfqfVar, int i11, zzfqh zzfqhVar) {
        this.zzb = str;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqp) {
            zzfqp zzfqpVar = (zzfqp) obj;
            if (this.zzb.equals(zzfqpVar.zzc())) {
                zzfqpVar.zzd();
                int i10 = this.zzc;
                int iZze = zzfqpVar.zze();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iZze) {
                    zzfqpVar.zza();
                    zzfqpVar.zzb();
                    int i11 = this.zzd;
                    int iZzf = zzfqpVar.zzf();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i10 = this.zzc;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.zzd != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.zzc;
        return m6.a.j(m1.m("FileComplianceOptions{fileOwner=", this.zzb, ", hasDifferentDmaOwner=false, fileChecks=", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS", ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose="), this.zzd == 1 ? "READ_AND_WRITE" : "null", "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final zzfqe zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final zzfqf zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final int zzf() {
        return this.zzd;
    }
}
