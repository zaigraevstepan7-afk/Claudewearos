package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class zzch extends zzbn implements zzci {
    public zzch() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            zzbo.zzc(parcel);
            zze(string, string2, bundle, j);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            int iZzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(iZzd);
        }
        return true;
    }
}
