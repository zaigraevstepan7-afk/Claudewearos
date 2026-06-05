package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdzx implements zzffw {
    protected final Context zza;
    protected final String zzb;

    public zzdzx(Context context, String str, zzbvw zzbvwVar, int i10) {
        this.zza = context;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzffw
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzdzw zza(zzdzv zzdzvVar) {
        String str = zzdzvVar.zza;
        int i10 = zzdzvVar.zzb;
        Map map = zzdzvVar.zzc;
        byte[] bArr = zzdzvVar.zzd;
        String str2 = zzdzvVar.zze;
        n.D.f11584k.getClass();
        return zzc(str, i10, map, bArr, str2, SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0243, code lost:
    
        throw new com.google.android.gms.internal.ads.zzdwe(1, "Received error HTTP response code: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0267, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0193, code lost:
    
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x021c, code lost:
    
        rc.k.g("Received error HTTP response code: " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzdzw zzc(java.lang.String r19, int r20, java.util.Map r21, byte[] r22, java.lang.String r23, long r24) throws com.google.android.gms.internal.ads.zzdwe, java.net.MalformedURLException {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzx.zzc(java.lang.String, int, java.util.Map, byte[], java.lang.String, long):com.google.android.gms.internal.ads.zzdzw");
    }
}
