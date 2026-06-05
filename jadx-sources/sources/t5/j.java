package t5;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import r5.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f15818a;

    public j(TransformationMethod transformationMethod) {
        this.f15818a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f15818a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || k.a().c() != 1) {
            return charSequence;
        }
        k kVarA = k.a();
        kVarA.getClass();
        return kVarA.g(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f15818a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i10, rect);
        }
    }
}
