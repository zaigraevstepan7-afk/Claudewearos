package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f11178a;

    /* renamed from: b, reason: collision with root package name */
    public final d8.e f11179b;

    public s(TextView textView) {
        this.f11178a = textView;
        d8.e eVar = new d8.e();
        eVar.f5001a = new t5.g(textView);
        this.f11179b = eVar;
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f11178a.getContext().obtainStyledAttributes(attributeSet, i.a.f8053g, i10, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((a.a) this.f11179b.f5001a).W(z2);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
