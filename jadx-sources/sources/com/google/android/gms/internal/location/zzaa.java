package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzaa extends a implements t {
    private final Status zzb;
    public static final zzaa zza = new zzaa(Status.f3488e);
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();

    public zzaa(Status status) {
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.b0(parcel, 1, this.zzb, i10, false);
        c.j0(iH0, parcel);
    }
}
