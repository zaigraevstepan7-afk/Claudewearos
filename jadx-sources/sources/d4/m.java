package d4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f4944a;

    /* renamed from: b, reason: collision with root package name */
    public int f4945b;

    /* renamed from: c, reason: collision with root package name */
    public float f4946c;

    /* renamed from: d, reason: collision with root package name */
    public float f4947d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f4973g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f4946c = typedArrayObtainStyledAttributes.getFloat(index, this.f4946c);
            } else if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f4944a);
                this.f4944a = i11;
                this.f4944a = o.f4961d[i11];
            } else if (index == 4) {
                this.f4945b = typedArrayObtainStyledAttributes.getInt(index, this.f4945b);
            } else if (index == 3) {
                this.f4947d = typedArrayObtainStyledAttributes.getFloat(index, this.f4947d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
