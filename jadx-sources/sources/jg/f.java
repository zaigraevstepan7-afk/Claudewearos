package jg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f extends od.a {
    public static final Parcelable.Creator<f> CREATOR = new c(2);

    /* renamed from: a, reason: collision with root package name */
    public String f8881a;

    /* renamed from: b, reason: collision with root package name */
    public String f8882b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f8883c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f8884d;

    /* renamed from: e, reason: collision with root package name */
    public d f8885e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8881a, false);
        uk.c.c0(parcel, 2, this.f8882b, false);
        uk.c.g0(parcel, 3, this.f8883c, false);
        uk.c.g0(parcel, 4, this.f8884d, false);
        uk.c.b0(parcel, 5, this.f8885e, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
