package w5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new pc.j(14);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18613a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18614b;

    public c(Parcel parcel) {
        this.f18613a = parcel.createStringArrayList();
        this.f18614b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f18613a);
        parcel.writeTypedList(this.f18614b);
    }
}
