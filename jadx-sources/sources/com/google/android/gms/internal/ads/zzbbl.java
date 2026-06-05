package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import fc.y;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbbl extends mc.c {
    public zzbbl(Context context, Looper looper, com.google.android.gms.common.internal.b bVar, com.google.android.gms.common.internal.c cVar) {
        super(zzbvy.zza(context), looper, bVar, cVar, 123);
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof zzbbo ? (zzbbo) iInterfaceQueryLocalInterface : new zzbbo(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final nd.d[] getApiFeatures() {
        return y.f6722c;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        return ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzca)).booleanValue() && ud.c.e(getAvailableFeatures(), y.f6721b);
    }

    public final zzbbo zzq() {
        return (zzbbo) getService();
    }
}
