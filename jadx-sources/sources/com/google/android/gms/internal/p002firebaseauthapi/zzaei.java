package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaei extends zzagb {
    private String zza;
    private String zzb;
    private String zzc;
    private zzafb zzd;
    private String zze;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagb
    public final zzagb zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null idToken");
        }
        this.zze = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagb
    public final zzagb zzb(String str) {
        if (str == null) {
            throw new NullPointerException("Null providerId");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagb
    public final zzagb zzc(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagb
    public final zzagb zzd(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagb
    public final zzagb zza(zzafb zzafbVar) {
        if (zzafbVar != null) {
            this.zzd = zzafbVar;
            return this;
        }
        throw new NullPointerException("Null tokenType");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagb
    public final zzafy zza() {
        String str;
        zzafb zzafbVar;
        String str2;
        String str3 = this.zza;
        if (str3 != null && (str = this.zzc) != null && (zzafbVar = this.zzd) != null && (str2 = this.zze) != null) {
            return new zzaej(str3, this.zzb, str, zzafbVar, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" providerId");
        }
        if (this.zzc == null) {
            sb2.append(" token");
        }
        if (this.zzd == null) {
            sb2.append(" tokenType");
        }
        if (this.zze == null) {
            sb2.append(" idToken");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb2)));
    }
}
