package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbmg extends zzayr implements zzbmi {
    public zzbmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzb(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzdb(1, parcelZza);
    }
}
