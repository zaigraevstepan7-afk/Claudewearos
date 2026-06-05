package com.google.android.gms.internal.p002firebaseauthapi;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaeg extends zzafx {
    private final String zza;
    private final String zzb;

    public zzaeg(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzafx) {
            zzafx zzafxVar = (zzafx) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzafxVar.zzb()) : zzafxVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzafxVar.zza()) : zzafxVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return m1.k("RecaptchaEnforcementState{provider=", this.zza, ", enforcementState=", this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafx
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafx
    public final String zzb() {
        return this.zza;
    }
}
