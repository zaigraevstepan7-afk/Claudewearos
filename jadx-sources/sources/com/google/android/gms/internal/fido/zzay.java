package com.google.android.gms.internal.fido;

import com.google.android.apps.common.proguard.SideEffectFree;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzay {
    private final String zza;
    private final Set zzb;
    private final boolean zzc;

    private zzay(String str, Set set, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.zza = "com.google.android.gms.fido";
        this.zzb = set;
        this.zzc = z12;
    }

    @SideEffectFree
    public final zzaq zza(String str, long j) {
        final Class<Long> cls = Long.class;
        return new zzaq(this.zza, str, Long.valueOf(j), new zzak(false, false, false, this.zzc, false, this.zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzav
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzaw
        }), true);
    }

    @SideEffectFree
    public final zzaq zzb(String str, String str2) {
        final Class<String> cls = String.class;
        return new zzaq(this.zza, str, str2, new zzak(false, false, false, this.zzc, false, this.zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzat
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzau
        }), true);
    }

    @SideEffectFree
    public final zzaq zzc(String str, boolean z2) {
        Boolean boolValueOf = Boolean.valueOf(z2);
        final Class<Boolean> cls = Boolean.class;
        return new zzaq(this.zza, str, boolValueOf, new zzak(false, false, false, this.zzc, false, this.zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzar
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzas
        }), true);
    }

    public final zzay zzd() {
        return new zzay(this.zza, this.zzb, false, false, false, true, false);
    }

    public final zzay zze(Set set) {
        return new zzay(this.zza, set, false, false, false, this.zzc, false);
    }

    public zzay(String str) {
        this("com.google.android.gms.fido", zzcf.zzk(), false, false, false, false, false);
    }
}
