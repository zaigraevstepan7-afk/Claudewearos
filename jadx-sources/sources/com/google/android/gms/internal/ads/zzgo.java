package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgo {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzaq.zzb("media3.datasource");
    }

    public final String toString() {
        StringBuilder sbK = m6.a.k("DataSpec[GET ", this.zza.toString(), ", ");
        sbK.append(this.zze);
        sbK.append(", ");
        sbK.append(this.zzf);
        sbK.append(", null, ");
        return m6.a.h(sbK, this.zzg, "]");
    }

    public final zzgm zza() {
        return new zzgm(this, null);
    }

    public final boolean zzb(int i10) {
        return (this.zzg & i10) == i10;
    }

    private zzgo(Uri uri, long j, int i10, byte[] bArr, Map map, long j4, long j10, String str, int i11, Object obj) {
        boolean z2 = false;
        boolean z10 = j4 >= 0;
        zzdd.zzd(z10);
        zzdd.zzd(z10);
        if (j10 > 0) {
            z2 = true;
        } else if (j10 == -1) {
            j10 = -1;
            z2 = true;
        }
        zzdd.zzd(z2);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j4;
        this.zzf = j10;
        this.zzg = i11;
    }

    @Deprecated
    public zzgo(Uri uri, long j, long j4, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j4, null, 0, null);
    }
}
