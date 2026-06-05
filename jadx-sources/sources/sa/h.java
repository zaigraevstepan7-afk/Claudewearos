package sa;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f14858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14859c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14860d;

    public /* synthetic */ h(ej.e eVar, Object obj, Object obj2, int i10) {
        this.f14857a = i10;
        this.f14858b = eVar;
        this.f14859c = obj;
        this.f14860d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f14857a;
        Object obj = this.f14860d;
        Object obj2 = this.f14859c;
        ej.e eVar = this.f14858b;
        switch (i10) {
            case 0:
                ImageView imageView = ((j) obj).f14879v;
                float f10 = g.f14848a;
                int[] iArr = new int[2];
                imageView.getLocationInWindow(iArr);
                int i11 = iArr[0];
                eVar.invoke((xa.f) obj2, new Rect(i11, iArr[1], imageView.getWidth() + i11, imageView.getHeight() + iArr[1]));
                break;
            default:
                ImageView imageView2 = (ImageView) obj;
                xa.f fVar = ((ta.f) obj2).f16163a;
                fj.l.c(imageView2);
                int[] iArr2 = new int[2];
                imageView2.getLocationInWindow(iArr2);
                int i12 = iArr2[0];
                eVar.invoke(fVar, new Rect(i12, iArr2[1], imageView2.getWidth() + i12, imageView2.getHeight() + iArr2[1]));
                break;
        }
    }
}
