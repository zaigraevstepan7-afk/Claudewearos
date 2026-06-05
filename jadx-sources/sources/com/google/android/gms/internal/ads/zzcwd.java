package com.google.android.gms.internal.ads;

import java.util.Set;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcwd extends zzdbm implements zzcvv {
    public zzcwd(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzc(final h2 h2Var) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcwc
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzcwh) obj).zzr(h2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzd() {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcwb
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzcwh) obj).zzr(zzfdp.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zze(final zzdgf zzdgfVar) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcwa
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                zzcwh zzcwhVar = (zzcwh) obj;
                String message = zzdgfVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzcwhVar.zzr(zzfdp.zzd(12, message, null));
            }
        });
    }
}
