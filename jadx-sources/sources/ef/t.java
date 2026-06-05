package ef;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t extends u {

    /* renamed from: b, reason: collision with root package name */
    public float f6054b;

    /* renamed from: c, reason: collision with root package name */
    public float f6055c;

    @Override // ef.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f6056a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f6054b, this.f6055c);
        path.transform(matrix);
    }
}
