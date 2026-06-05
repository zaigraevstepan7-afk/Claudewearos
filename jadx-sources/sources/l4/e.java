package l4;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ Font.Builder k(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder n(ClipData clipData, int i10) {
        return new ContentInfo.Builder(clipData, i10);
    }

    public static /* bridge */ /* synthetic */ ContentInfo p(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder t(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }
}
