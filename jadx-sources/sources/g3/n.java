package g3;

import android.content.Context;
import android.graphics.Path;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7146a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7148c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7149d;

    public /* synthetic */ n(int i10, int i11, xa.b bVar) {
        this.f7147b = i10;
        this.f7148c = i11;
        this.f7149d = bVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f7146a) {
            case 0:
                c2.j jVar = (c2.j) this.f7149d;
                q qVar = (q) obj;
                fk.g gVar = qVar.f7166a;
                int iD = qVar.d(this.f7147b);
                int iD2 = qVar.d(this.f7148c);
                CharSequence charSequence = (CharSequence) gVar.f6829e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbQ = gk.b.q("start(", iD, ") or end(", iD2, ") is out of range [0..");
                    sbQ.append(charSequence.length());
                    sbQ.append("], or start > end!");
                    m3.a.a(sbQ.toString());
                }
                Path path = new Path();
                h3.j jVar2 = (h3.j) gVar.f6828d;
                jVar2.f7607f.getSelectionPath(iD, iD2, path);
                int i10 = jVar2.f7609h;
                if (i10 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i10);
                }
                c2.j jVar3 = new c2.j(path);
                float f10 = qVar.f7171f;
                jVar3.l((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
                c2.j.a(jVar, jVar3);
                return pi.o.f13011a;
            default:
                xa.b bVar = (xa.b) this.f7149d;
                Context context = (Context) obj;
                fj.l.f(context, "ctx");
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_displayable_item, (ViewGroup) null, false);
                int i11 = this.f7147b;
                viewInflate.setLayoutParams(new FrameLayout.LayoutParams(i11, i11));
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.app_icon_image);
                TextView textView = (TextView) viewInflate.findViewById(R.id.icon_label);
                View viewFindViewById = viewInflate.findViewById(R.id.app_icon_selection_badge);
                fj.l.c(imageView);
                xa.a.a(imageView, this.f7148c, bVar, null, null, 56);
                textView.setVisibility(8);
                viewFindViewById.setVisibility(8);
                return viewInflate;
        }
    }

    public /* synthetic */ n(c2.j jVar, int i10, int i11) {
        this.f7149d = jVar;
        this.f7147b = i10;
        this.f7148c = i11;
    }
}
