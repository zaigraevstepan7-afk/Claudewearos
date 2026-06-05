package hf;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b0 extends k5.b {
    public static final Parcelable.Creator<b0> CREATOR = new t1.p(3);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f7897c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7898d;

    public b0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7897c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7898d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f7897c) + "}";
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        TextUtils.writeToParcel(this.f7897c, parcel, i10);
        parcel.writeInt(this.f7898d ? 1 : 0);
    }
}
