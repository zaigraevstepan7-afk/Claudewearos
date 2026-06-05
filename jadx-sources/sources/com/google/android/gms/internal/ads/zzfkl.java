package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfkl {
    private final String zza;
    private final fc.b zzb;
    private final String zzc;

    public /* synthetic */ zzfkl(zzfkj zzfkjVar, zzfkk zzfkkVar) {
        this.zza = zzfkjVar.zza;
        this.zzb = zzfkjVar.zzb;
        this.zzc = zzfkjVar.zzc;
    }

    public final boolean equals(Object obj) {
        fc.b bVar;
        fc.b bVar2;
        if (obj instanceof zzfkl) {
            zzfkl zzfklVar = (zzfkl) obj;
            if (this.zza.equals(zzfklVar.zza) && (bVar = this.zzb) != null && (bVar2 = zzfklVar.zzb) != null && bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String zza() {
        fc.b bVar = this.zzb;
        return bVar == null ? "unknown" : bVar.name().toLowerCase(Locale.ENGLISH);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }
}
