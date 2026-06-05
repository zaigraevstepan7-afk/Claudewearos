package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzepd implements zzhfy {
    public static zzepd zza() {
        return zzepc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        Object arrayList = new ArrayList();
        zzbct zzbctVar = zzbdc.zzlX;
        t tVar = t.f12227d;
        if (!((String) tVar.f12230c.zzb(zzbctVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) tVar.f12230c.zzb(zzbctVar)).split(","));
        }
        zzhgg.zzb(arrayList);
        return arrayList;
    }
}
