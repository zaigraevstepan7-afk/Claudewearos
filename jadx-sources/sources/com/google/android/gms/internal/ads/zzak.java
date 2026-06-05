package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzak {
    public final Uri zza;
    public final String zzb;
    public final zzah zzc;
    public final zzac zzd;
    public final List zze;
    public final String zzf;
    public final zzfyf zzg;
    public final Object zzh;
    public final long zzi;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ zzak(Uri uri, String str, zzah zzahVar, zzac zzacVar, List list, String str2, zzfyf zzfyfVar, Object obj, long j, zzao zzaoVar) {
        this.zza = uri;
        int i10 = zzay.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfyfVar;
        int i11 = zzfyf.zzd;
        zzfyc zzfycVar = new zzfyc();
        if (zzfyfVar.size() > 0) {
            throw null;
        }
        zzfycVar.zzi();
        this.zzh = null;
        this.zzi = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzak)) {
            return false;
        }
        zzak zzakVar = (zzak) obj;
        return this.zza.equals(zzakVar.zza) && this.zze.equals(zzakVar.zze) && this.zzg.equals(zzakVar.zzg);
    }

    public final int hashCode() {
        return (int) ((((this.zzg.hashCode() + gk.b.h(this.zza.hashCode() * 923521, 961, this.zze)) * 31) * 31) - Long.MAX_VALUE);
    }
}
