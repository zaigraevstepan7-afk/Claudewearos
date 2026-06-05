package re;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import t1.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends k5.b {
    public static final Parcelable.Creator<a> CREATOR = new p(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f14369c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14370d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14371e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14372f;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f14373z;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f14369c = parcel.readInt();
        this.f14370d = parcel.readInt();
        this.f14371e = parcel.readInt() == 1;
        this.f14372f = parcel.readInt() == 1;
        this.f14373z = parcel.readInt() == 1;
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f14369c);
        parcel.writeInt(this.f14370d);
        parcel.writeInt(this.f14371e ? 1 : 0);
        parcel.writeInt(this.f14372f ? 1 : 0);
        parcel.writeInt(this.f14373z ? 1 : 0);
    }

    public a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f14369c = bottomSheetBehavior.N;
        this.f14370d = bottomSheetBehavior.f3801e;
        this.f14371e = bottomSheetBehavior.f3795b;
        this.f14372f = bottomSheetBehavior.I;
        this.f14373z = bottomSheetBehavior.J;
    }
}
