package ff;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import t1.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e extends k5.b {
    public static final Parcelable.Creator<e> CREATOR = new p(2);

    /* renamed from: c, reason: collision with root package name */
    public final int f6741c;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6741c = parcel.readInt();
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f6741c);
    }

    public e(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f6741c = sideSheetBehavior.f3928h;
    }
}
