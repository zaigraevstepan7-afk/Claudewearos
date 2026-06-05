package w4;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f18578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.f18578b = gVar;
        this.f18577a = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.f18577a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        g gVar = this.f18578b;
        if (gVar.f18585e != color) {
            gVar.f18585e = color;
            for (int size = gVar.f18582b.size() - 1; size >= 0; size--) {
                ((c) gVar.f18582b.get(size)).b(color);
            }
        }
    }
}
