package oc;

import android.os.Parcel;
import android.os.Parcelable;
import ig.e0;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends od.a {
    public static final Parcelable.Creator<a> CREATOR = new e0(28);

    /* renamed from: a, reason: collision with root package name */
    public final String f12444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12445b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12446c;

    public a(String str, String str2, String str3) {
        this.f12444a = str;
        this.f12445b = str2;
        this.f12446c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.c0(parcel, 1, this.f12444a, false);
        c.c0(parcel, 2, this.f12445b, false);
        c.c0(parcel, 3, this.f12446c, false);
        c.j0(iH0, parcel);
    }
}
