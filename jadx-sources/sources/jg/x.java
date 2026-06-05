package jg;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.e0;
import ig.f0;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class x implements od.b {
    public static final Parcelable.Creator<x> CREATOR = new c(5);

    /* renamed from: a, reason: collision with root package name */
    public d f8917a;

    /* renamed from: b, reason: collision with root package name */
    public w f8918b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f8919c;

    public x(d dVar) {
        e0.i(dVar);
        this.f8917a = dVar;
        ArrayList arrayList = dVar.f8876e;
        this.f8918b = null;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (!TextUtils.isEmpty(((y) arrayList.get(i10)).A)) {
                this.f8918b = new w(((y) arrayList.get(i10)).f8921b, ((y) arrayList.get(i10)).A, dVar.C);
            }
        }
        if (this.f8918b == null) {
            this.f8918b = new w(dVar.C);
        }
        this.f8919c = dVar.D;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 1, this.f8917a, i10, false);
        uk.c.b0(parcel, 2, this.f8918b, i10, false);
        uk.c.b0(parcel, 3, this.f8919c, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
