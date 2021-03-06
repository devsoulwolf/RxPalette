package io.sweers.rxpalette;

import android.graphics.Bitmap;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.v7.graphics.Palette;

import rx.Observable;

/**
 * Static factory methods for creating {@linkplain Observable observables} for {@link Palette}.
 */
public final class RxPalette {

    /**
     * Generate the {@link Palette} synchronously.
     */
    @CheckResult @NonNull
    public static Observable<Palette> generate(@NonNull Bitmap bitmap) {
        return Observable.create(new GeneratePaletteOnSubscribe(bitmap));
    }

    /**
     * Generate the {@link Palette} synchronously.
     */
    @CheckResult @NonNull
    public static Observable<Palette> generate(@NonNull Palette.Builder builder) {
        return Observable.create(new GeneratePaletteBuilderOnSubscribe(builder));
    }
}
