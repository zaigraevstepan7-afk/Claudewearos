package je;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import ig.e0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e extends od.a implements t {
    public static final Parcelable.Creator<e> CREATOR = new e0(6);

    /* renamed from: a, reason: collision with root package name */
    public final List f8862a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8863b;

    public e(String str, ArrayList arrayList) {
        this.f8862a = arrayList;
        this.f8863b = str;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.f8863b != null ? Status.f3488e : Status.B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.e0(parcel, 1, this.f8862a);
        uk.c.c0(parcel, 2, this.f8863b, false);
        uk.c.j0(iH0, parcel);
    }
}
