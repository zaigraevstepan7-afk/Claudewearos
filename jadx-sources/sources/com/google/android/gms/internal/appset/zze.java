package com.google.android.gms.internal.appset;

import android.os.Parcel;
import cd.d;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (d) zzc.zza(parcel, d.CREATOR));
        return true;
    }
}
